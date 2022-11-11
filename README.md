# spring-boot-keycloak-resource-server

### How to protect your Spring Boot microservice with OAuth2?

### How to set up KeyCloak for OAuth2 client credentials flow?

We live in the age of microservices.

Microservices are often deployed as REST APIs.

And the most popular way to protect and access these REST APIs is through OAuth2 protocol.

And in OAuth2 protocol ,the preferred way to protect REST APIs is through client credentials.

To set this,

You first need an Identity and Access Management provider or in OAuth2 terms ,an authorization server.

KeyCloak is one such authorization server.

This post explains how to set up a KeyCloak server for client credentials flow in OAuth2.

Once the set up is done you will be able to protect your REST APIs / microservices using OAuth2(these are called
resource servers in OAuth2)

And also you will be able to access OAuth2 protected resources using client credentials from other microservices (these
are called clients in OAuth2 terms).

Below is the algorithm to set up client credentials flow in KeyCloak:

**STEP 1**: Download KeyCloak

**STEP 2**: Run KeyCloak

**STEP 3**: Create an admin user

**STEP 4**: Create a realm

**STEP 5**: Create an OAuth2 client

**STEP 6**: Get OAuth2 configuration details

**STEP 7**: Test