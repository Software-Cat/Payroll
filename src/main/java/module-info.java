module io.github.softwarecat.payroll {
    requires java.annotation;
    requires java.persistence;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.hateoas;
    requires spring.web;
    requires spring.data.jpa;

    requires org.slf4j;

    requires lombok;
}
