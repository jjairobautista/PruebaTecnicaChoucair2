#language: es

@historia
Característica: Creacion Usuario Utest.com
  Como usuario, deseo hacer la creacion de usuario  en la plataforma de Utest.com

  @escenario1
  Escenario: : Creacion Usuario
    Dado Que un usuario desea registrarse en la plataforma de Utest

    Cuando Diligencie el primer paso del registro en la plataforma de Utest
      | nombre     | apellido       | email                     | mesC      | dayC | anioC | lenguajeUs |
      | Jhon Jairo | Bautista Amaya | jhonbautist@gmail.com | September | 26   | 1998  | Spanish    |

    Y Diligencie el segundo paso del registro en la plataforma de Utest
      | ciudad | codPostal | pais     |
      | Bogotá | 110111    | Colombia |

    Y Diligencie el tercer paso del registro en la plataforma de Utest
      | computadora | versionSo    | lenguajeCom | dispMovil | modelo            | sisOperativo |
      | Windows     | Vista 64-bit | Spanish     | Xiaomi    | Redmi Note 10 Pro | Android 11   |

    Y Diligencie el cuarto paso del registro en la plataforma de Utest
      | asignarClave  | confirmarClave |
      | Colombia2022* | Colombia2022*  |

    Y puede hacer el login en la plataforma de Utest
      | usuario                   | clave         |
      | jhonbautist@gmail.com | Colombia2022* |

    Entonces validar inicio de sesion
      | validacion                                               |
      | First things first... ☝ |