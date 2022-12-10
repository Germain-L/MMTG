# Titre
Projet d'intégration continue.

Ce projet comprend plusieurs petites applications.

 - Application de calcul de porte monaie
 - Application d'envoi de message
 - Application de calcul de situation financière
 - Application de calcul du nombre de bières à boire avant de mourir
 - Application d'IV de Pokémon
 - Application d'évaluation d'armes

## Setup githooks
```bash
git config core.hooksPath .githooks
```

## Que font les hooks ?

 - `commit-msg` : Change le message de commit pour ajouter le nom de l'auteur
 - `pre-push` : Protège la branche prod en empêchant le push sur cette branche sauf si l'autheur est Germain 

## Participants
 - Marc-Olivier CAS
 - Maximilien DELIBES-HOUDAYER
 - Thomas BARILLE
 - Germain LEIGNEL