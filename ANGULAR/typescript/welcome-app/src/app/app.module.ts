import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { customComponent } from './custom.component';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,customComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
