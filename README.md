# karaf-feature-practice

Proof-of-concept project to learn how to leverage Karaf features.

The project doesn't use a Maven Parent POM.

## Concept

- Have the "root" standalone POM track an artifact whose only task is to track a list of bundles and their required
  files.
- Each bundle has its own standalone POM.

## Commands

In a Karaf shell:

Add the feature repository using the Maven URI:

```shell
feature:repo-add mvn:com.asodc.karaf.feature/karaf-feature-practice/1.0-SNAPSHOT/xml
```

Install the feature:

TODO: find out why the config part of the features.xml is failing 

```shell
feature:install karaf-feature-practice 1.0-SNAPSHOT
```
