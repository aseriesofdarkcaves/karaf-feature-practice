# karaf-feature-practice

Proof-of-concept project to learn how to leverage Karaf features.

## Concept

- Have the parent POM track an artifact whose only task is to track a list of bundles and their required
  files.
- Each bundle inherits from the parent.

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

Check to see the log to find that the default log message has changed (because the feature deploys a cfg file)!

```shell
log:tail
```

If any changes are made to the features.xml or the bundles in the feature, you need to reinstall them to the local repo
via mvn:install.

The next few commands are useful if changes don't propagate, but I still need to work out the correct use-cases.

```shell
# refresh all repos
feature:repo-refresh

# refresh a spectific repo
feature:repo-refresh mvn:com.asodc.karaf.feature/karaf-feature-practice/1.0-SNAPSHOT/xml

# refresh features to reprovision existing features
feature:refresh
```

Remove the feature:

```shell
feature:uninstall karaf-feature-practice
```
