package ru.job4j.notification.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.notification.model.Notification;

@Repository
public interface NotificationPersist extends CrudRepository<Notification, Integer> {
}