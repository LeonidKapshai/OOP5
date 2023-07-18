package presenter;

import essence.Human;
import service.Service;
import ui.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presenter {
    private final View view;
    private final Service<Human> service;

    public Presenter(View view, Service<Human> service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void onClick(String text) {