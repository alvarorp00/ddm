# Assignment 3 - Code Generation (Acceleo)

## Comments about the folder structure

```bash
.
|-- wizards.acceleo
|   |-- bin -- ...
|   |-- META-INF
|   |-- outputs
|   |   |-- components
|   |   |-- listeners
|   |   |-- main
|   |   |-- wizard
|   |-- src
|   |   |-- wizards
|   |       |-- acceleo
|   |       |   |-- common
|   |       |   |-- main
|   |       |-- impl
|   |       |-- util
|   |-- tasks
|-- wizards.ecore
    |-- bin -- ...
    |-- META-INF
    |-- model
    |-- src
        |-- wizards
            |-- impl
            |-- util
```

- `wizards.ecore` contains the metamodel (_wizards.ecore/model/wizards.ecore_) and an instance of the model (_wizards.ecore/model/wizards.xmi_)
- `wizards.acceleo` contains the code generator (_wizards.acceleo/src/wizards.acceleo.main/generate.mtl_ & _wizards.acceleo/src/wizards.acceleo.common/*.mtl_)

## Comments about the implementation of acceleo project

As the acceleo project was yelling at me for not recognising some packages (all of the model generated with ecore from the metamodel) I decided to copy them inside wizards.acceleo, and can be found under _wizards.acceleo/src/wizards_, _wizards.acceleo/src/wizards.impl_ and _wizards.acceleo/src/wizards.util_. This fixed the problem (might have been solved with configuring some stuff in workspace, I don't know).

Under _wizards.acceleo/outputs_ can be found the target folder (_outputs/wizard/._) where the **Wizard.java** will be produced by running the **generate.mtl** file, and all the necessary files implemented to run the graphics (check _outputs/components_, _outputs/listeners_ and _outputs/main_). The name of these java files is the same as the ones in the model generated from the ecore file but since they're on a difference package we don't care about it and simplifies the thing.

Hence, just one **Wizard.java** file is produced and will use the predefined java classes to build the GUI. Check the demo video added for further info, but should be easy to follow and reproduce by:

1. Once the ecore file is supplied together with the model (**.xmi** file) don't do anything more in _wizards.ecore_.
2. Run the code generator in _wizards.acceleo/src/wizards.acceleo.main/generate.mtl_ by right-clicking on it and running as acceleo application.
3. Run the main in _wizards.acceleo/outputs/main/Main.java_ by right-clicking on it and running as Java application: this has been configured for the project in Run-configurations, but you can take all the code inside _outputs_ and move it outside and execute it or right-click _outputs_ folder --> _build path_ --> Use as source folder.


