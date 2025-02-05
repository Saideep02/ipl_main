import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { IplRoutingModule } from "./ipl-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { TeamCreateComponent } from "./components/teamcreate/teamcreate.component";
import { CricketerCreateComponent } from "./components/cricketercreate/cricketercreate.component";
import { MatchCreateComponent } from "./components/matchcreate/matchcreate.component";
import { TicketBookingComponent } from "./components/ticketbooking/ticketbooking.component";
import { VoteComponent } from "./components/vote/vote.component";
<<<<<<< HEAD
import { RouterModule } from "@angular/router";
import { SharedModule } from "../shared/shared.module";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { CricketerEditComponent } from "./components/cricketeredit/cricketeredit.component";
import { TeamEditComponent } from "./components/teamedit/teamedit.component";
import { MatchEditComponent } from "./components/matchedit/matchedit.component";
=======
>>>>>>> origin/main

@NgModule({
  declarations: [
    TeamCreateComponent,
    CricketerCreateComponent,
    MatchCreateComponent,
    TicketBookingComponent,
<<<<<<< HEAD
    VoteComponent,
    DashboardComponent,
    CricketerEditComponent,
    TeamEditComponent,
    MatchEditComponent
=======
    VoteComponent
>>>>>>> origin/main
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
<<<<<<< HEAD
    IplRoutingModule,
    RouterModule,
    SharedModule
=======
>>>>>>> origin/main
  ],
  exports: [
    
  ]
})
export class IplModule {}