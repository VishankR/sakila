module sakila {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires spring.aop;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.data.commons;
    requires spring.web;

    opens com.vishank.sakila to spring.core;
    opens com.vishank.sakila.controller to spring.core;
    opens com.vishank.sakila.entities to org.hibernate.orm.core;
    opens com.vishank.sakila.repositories.impls to spring.core;
    opens com.vishank.sakila.services.impls to spring.core;

    exports com.vishank.sakila to spring.beans, spring.context;
    exports com.vishank.sakila.controller to spring.beans, spring.context, spring.web;
    exports com.vishank.sakila.entities to com.fasterxml.jackson.databind;
    exports com.vishank.sakila.repositories.impls to spring.beans, spring.context, spring.aop;
    exports com.vishank.sakila.services.impls to spring.beans, spring.context;
}