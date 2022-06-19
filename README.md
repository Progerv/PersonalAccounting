# О приложении
Приложение "Personal accounting" - приложения для ведения учета личных финансов.

# Основная функциональность
#### Приложение позволяет вести личную бухгалтерию.
#### Вносить доходы и расходы и расделять их по категориям для анализа.
#### Просматривать отчеты за период.
#### Загрузка текущих курсов валют с сервиса (https://api.currencyfreaks.com/) для пересчета в одну валюту для отображения в отчетах.

# Список экранов
### 1. Список категорий расходов и доходов (диалог добавления/редактирования)
### 2. Список расходов/доходов (диалог добавления/редактирования)
### 3. Настройки
#### 3.1. Основная валюта (RUB,EUR,USD)
#### 3.2. Язык приложения (ENG,RUS)
### 4. Отчеты
#### 4.1. Круговая диаграмма процентов расхода/дохода за период
#### 4.2. Список по суммам расхода/дохода за период

# Используемый стек
* Kotlin + Coroutines
* Clean Architecture + MVVM
* Dagger 2
* Retrofit
* Room Persistence Library
* Unit testing: JUnit, Mockito
* Code analysis: Android Lint
