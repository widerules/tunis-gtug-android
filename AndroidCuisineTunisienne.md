# Introduction #
Le projet « Android pour la cuisine tunisienne » s’agit de mettre en œuvre une application permettant « d’explorer » des menus et des plats traditionnels d’une région spécifique en Tunisie et de gérer tout un programme d’une sortie qui peut être partager par plusieurs utilisateurs possédant des smartphones équiper d’un système Android.
# Details #
L’application se présente comme une interface Android et doit être en mesure de manipuler des données concernant :
  * Les utilisateurs se partageant un même programme de sortie,
  * Les menus et les plats traditionnels,
  * Les restaurants et les petits coins offrant ces plats,
  * Les régions où se trouvent les restaurants choisis.
Pour l’instant, l’interface est accessible par tous types d’utilisateurs.

D’une manière générale l’utilisateur accède à son espace en saisissant son login et son mot de passe.
> ### a) Gestion des utilisateurs ###
  * Il doit être possible d’effectuer toutes les opérations de base (Consulter, Ajouter, Modifier, Supprimer).
  * Tous les champs, excepté l’identifiant de l’utilisateur, sont modifiables.
  * Il doit être possible d’organiser et d’annuler, à tout moment, une ou plusieurs sorties.
  * Lors de l’ajout d’un nouvel utilisateur, aucun champ ne doit être vide.
  * Avant la suppression d’un utilisateur du système, toutes les sorties qu’il a organiser doivent être annulées.
> ### b) Gestion des sorties ###
  * L’identifiant et la date d’organisation d’une sortie ne peuvent pas être modifiables.
  * Chaque sorite doit être modifiable de manière unique.
  * Lors de l’affichage, il doit y avoir un lien vers son organisateur.
  * L’affichage doit montrer toutes les informations concernant la sortie ainsi que la date exacte de la sortie.
> ### c) Gestion des menus et des plats traditionnels ###
  * Les menus, dans une sortie, doivent pouvoir être ajoutés, supprimés, consultés et partiellement modifiés leurs rangs dans la liste.
  * Le rang d’un menu ajouté à la liste doit être incrémenté de un par rapport au dernier ajouté.
  * L’organisateur doit confirmer la suppression d’un menu.
> ### d) Gestion des restaurants ###
  * Les restaurants, offrants les menus, doivent pouvoir être ajoutés, supprimés, consultés et partiellement modifiés leurs rangs dans la liste.
  * Un système de localisation tel que « google.map » pourra renseigner sur l’adresse du restaurant.
> ### e) Consultation des régions en Tunisie ###
  * L’utilisateur ne peut que consulter les régions.
> ### f) Partie utilisateur simple ###
  * L’utilisateur se connecte au système en saisissant son nom et son mot de passe. Si le nom et le mot de passe ne correspondent pas, l’anonyme est bloqué à la page d’authentification.
  * Une fois que l’utilisateur s’est identifié, il doit accéder aux écrans où il pourra consulter toutes ses informations personnelles ainsi que celles de chacune des sorties a lesquelles il participe.
  * De ces écrans, l’utilisateur devra pouvoir consulter un menu d’un restaurant disponible à la région pour pouvoir l’ajouter a sa liste.
Après avoir terminer la partie conception, il s’agira de développer un prototype incorporant les fonctionnalités citées ci haut.

Et pour conclure, nous avons pu à travers ce qui a précédé de présenter le cahier des charges de ce projet. La partie suivante sera consacrée à la présentation de la solution proposée et les fonctionnalités qu’elle devra être en mesure d’assurer.