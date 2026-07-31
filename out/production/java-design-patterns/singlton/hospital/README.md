# Hospital Logger - Singleton Pattern

## Problem

A hospital management system needs one centralized logger that can be accessed by different parts of the system.

Creating multiple logger objects can cause inconsistent logging, so the Singleton Pattern is used to ensure only one Logger instance exists.

## Design Pattern Used

Singleton Design Pattern

## Why Singleton?

The Singleton Pattern is useful when:

- Only one object should exist in the application.
- Multiple classes need access to the same object.
- A shared resource must be controlled.

## Implementation

The Logger class contains:

- A private static instance variable.
- A private constructor to prevent external object creation.
- A public static getInstance() method to provide access to the single object.

## Example Activities Logged

- Doctor login
- Patient check-in

## Output Example