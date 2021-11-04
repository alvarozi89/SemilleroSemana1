import { Component, OnInit } from '@angular/core';
import { ComicDTO } from 'src/app/semillero/dto/comic-dto';

@Component({
  selector: 'crear-persona',
  templateUrl: './crear-persona.component.html',
  styleUrls: ['./crear-persona.component.css']
})
export class CrearPersonaComponent implements OnInit {

  private nombreInstructor: string="Pepito";

  public listarComics: Array<any>;


  

  constructor() { }

  ngOnInit() {

    this.listarComics= new Array<any>();
    this.nombreInstructor = "Alvaro SR";
    let edadInstructor: number=33;

    if(edadInstructor<33){

      let resultadoCalculo=12;
      let resultado=resultadoCalculo+edadInstructor;

    }
    let concat="";

    for (let index = 0; index < this.nombreInstructor.length; index++) {
      let element = this.nombreInstructor[index];
      concat += ""+ element;
      
    }

    this.nombreInstructor= this.obtenerNombre();
     this.simularCrearComic();
  }
  public simularCrearComic():void{
    let comic3= new ComicDTO();
  /*   let comic1: any= {
      id:1,
      nombre:"Superman",
      tematica: "AVENTURAS",
      precio:300

    }

    let comic2: any= {
      id:2,
      nombre:"Dr. Strange",
      tematica: "AVENTURAS",
      precio:300

    } */
    comic3.id=3;
    comic3.nombre="Chapulin"
    comic3.precio= 200;
    comic3.tematicaEnum = "comedia";

   /*  this.listarComics.push(comic1);
    this.listarComics.push(comic2); */
    this.listarComics.push(comic3);

    this.listarComics.forEach(comic=>{
      console.log("Comic con nombre: "+comic.nombre+"Con precio:"+comic.precio);

    });

  /*   for (let comic in this.listarComics) {
      let comicResult: ComicDTO;
      console.log("Comic con nombre: "+comicResult.nombre+"Con precio:"+comicResult.precio);
     
    } */
  }

  public obtenerNombre():string {
    this.nombreInstructor="Shakira";
    let nombreInstructor= "Juanes";
    let apellidoInstructor= "Barrera";

    return nombreInstructor+apellidoInstructor;
  } 

}
