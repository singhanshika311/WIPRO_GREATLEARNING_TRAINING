import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
msg:string = 'hiiii';
  constructor() { }

  ngOnInit(): void {
  }
fun1(){
  this.msg ="hello";
}
}
