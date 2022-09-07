# Employee

This directory contains various implementations of an `Employee` class
with all kinds of problems to demonstrate different patterns and
solutions.

## Dependency Inversion Principle

Package `employee.v6_dip_sk` contains an implementation of the
`Employee` class that violates the direction of dependencies that
we want to achieve: `Employee` is in the `core` package but depends
on the `SqlDatabase` class in the `db` package.

Change the implementation so that all source code dependencies go from
`db` to `core`. You can achieve this by introducing an interface in the
`core` package that is used by the `Employee` class to make database
requests,  and an Adapter in the `db` package that translates the
method calls of this interface into the input that `SqlDatabase`
expects.

Take care when designing the interface that you really abstract from
the implementation details of the SqlDatabase (i.e., you should be
able to implement an adapter for a database that does not use SQL
without problems).
