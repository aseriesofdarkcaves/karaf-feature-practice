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

Check that the feature repo was added:

```shell
feature:repo-list
```

Install a feature:

```shell
feature:install karaf-feature-practice
```

TODO: Find out how to properly install the feature (something isn't right). Issue seems to be the config. The cfg file I
am referring to turns out not to have been included in the bundle1 jar.
Probably some issue with the build-helper-maven-plugin configuration.