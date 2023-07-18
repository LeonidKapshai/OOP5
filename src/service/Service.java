package service;

import essence.Essence;
import essence.Gender;
import essence.Human;
import families.Family;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service<T extends Essence<T>> {
    private final Family<T> family;