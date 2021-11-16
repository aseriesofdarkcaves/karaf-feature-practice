# karaf-feature-practice

Proof-of-concept project to learn how to leverage Karaf features.

The project doesn't use a Maven Parent POM.

## Concept

- Have the "root" standalone POM track an artifact whose only task is to track a list of bundles and their required
  files.
- Each bundle has its own standalone POM.
