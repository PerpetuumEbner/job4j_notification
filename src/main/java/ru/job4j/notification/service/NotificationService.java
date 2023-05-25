package ru.job4j.notification.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.notification.model.Notification;
import ru.job4j.notification.persistence.NotificationPersist;

@Service
@AllArgsConstructor
@Slf4j
public class NotificationService {
    private final NotificationPersist notificationPersist;

    @KafkaListener(topics = "notification")
    public void receiveOrder(Notification notification) {
        notificationPersist.save(notification);
        log.debug(notification.toString());
    }
}