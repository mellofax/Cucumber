Feature: Online courses navigation
  Scenario: Navigate and verify that title is correct
    Given Navigate to online cources page
    When Select "Автоматизированное тестирование на Java"
    Then I will see "Автоматизированное тестирование на Java" title
