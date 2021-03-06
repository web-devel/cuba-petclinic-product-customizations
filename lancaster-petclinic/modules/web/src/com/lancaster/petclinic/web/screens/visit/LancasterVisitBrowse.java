package com.lancaster.petclinic.web.screens.visit;

import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sample.petclinic.web.screens.visit.CalendarMode;
import com.haulmont.sample.petclinic.web.screens.visit.VisitBrowse;

@UiController("petclinic_Visit.browse")
@UiDescriptor("lancaster-visit-browse.xml")
public class LancasterVisitBrowse extends VisitBrowse {

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        current(CalendarMode.MONTH);
    }


}