package org.example.app.dto.employee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java records - клас, мета якого зберігати дані та надавати
 * деякі спеціальні функції. Наприклад, нема потреби описувати
 * конструктор, геттер, equals, hashCode, оскільки в "рекорді" ці речі будуть
 * автоматично згенеровані компілятором.
 */
// @JsonIgnoreProperties допомагає уникнути помилки
// при створенні об'єкта цього типу якщо якесь поле є null
@JsonIgnoreProperties(ignoreUnknown = true)
public record EmployeeDtoRequest(Long id, String firstName, String lastName, String jobPosition, String phone) {
}
