package kz.github.dumanyessengali.orderservice.repository;

import kz.github.dumanyessengali.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
