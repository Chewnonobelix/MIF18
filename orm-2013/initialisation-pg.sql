--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.2
-- Dumped by pg_dump version 9.2.2
-- Started on 2013-09-22 15:15:46

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1960 (class 1262 OID 12002)
-- Dependencies: 1959
-- Name: postgres; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 175 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1962 (class 0 OID 0)
-- Dependencies: 175
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 174 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 1963 (class 0 OID 0)
-- Dependencies: 174
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET search_path = public, pg_catalog;

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 16600)
-- Name: appellation; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE appellation (
    id integer NOT NULL,
    nom character varying(255),
    region integer
);


--
-- TOC entry 173 (class 1259 OID 16628)
-- Name: composition; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE composition (
    vin integer NOT NULL,
    variete character varying(60) NOT NULL,
    pourcentage integer,
    CONSTRAINT composition_pourcentage_check CHECK (((pourcentage >= 0) AND (pourcentage <= 100)))
);


--
-- TOC entry 168 (class 1259 OID 16467)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- TOC entry 169 (class 1259 OID 16585)
-- Name: producteur; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE producteur (
    id integer NOT NULL,
    nom character varying(255)
);


--
-- TOC entry 172 (class 1259 OID 16605)
-- Name: region; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE region (
    id integer NOT NULL,
    nom character varying(255),
    pays character varying(255)
);


--
-- TOC entry 170 (class 1259 OID 16590)
-- Name: vin; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE vin (
    id integer NOT NULL,
    nom character varying(255),
    annee integer,
    producteur integer,
    appellation integer,
    couleur character varying(5)
);


--
-- TOC entry 1952 (class 0 OID 16600)
-- Dependencies: 171
-- Data for Name: appellation; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO appellation (id, nom, region) VALUES (1, 'Vosnes-Romanée', 1);
INSERT INTO appellation (id, nom, region) VALUES (2, 'Côte de Nuits-Villages', 1);
INSERT INTO appellation (id, nom, region) VALUES (5, 'Pomerol', 4);
INSERT INTO appellation (id, nom, region) VALUES (6, 'Sauternes', 3);
INSERT INTO appellation (id, nom, region) VALUES (4, 'Chassagne-Montrachet', 2);
INSERT INTO appellation (id, nom, region) VALUES (3, 'Volnay', 2);


--
-- TOC entry 1954 (class 0 OID 16628)
-- Dependencies: 173
-- Data for Name: composition; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO composition (vin, variete, pourcentage) VALUES (2, 'Pinot Noir', 100);
INSERT INTO composition (vin, variete, pourcentage) VALUES (1, 'Pinot Noir', 100);
INSERT INTO composition (vin, variete, pourcentage) VALUES (3, 'Pinot Noir', 100);
INSERT INTO composition (vin, variete, pourcentage) VALUES (4, 'Pinot Noir', 100);
INSERT INTO composition (vin, variete, pourcentage) VALUES (5, 'Chardonnay', 100);
INSERT INTO composition (vin, variete, pourcentage) VALUES (6, 'Sémillon', NULL);
INSERT INTO composition (vin, variete, pourcentage) VALUES (6, 'Sauvignon blanc', NULL);
INSERT INTO composition (vin, variete, pourcentage) VALUES (6, 'Muscadelle', NULL);
INSERT INTO composition (vin, variete, pourcentage) VALUES (7, 'Sémillon', 83);
INSERT INTO composition (vin, variete, pourcentage) VALUES (7, 'Sauvignon blanc', 12);
INSERT INTO composition (vin, variete, pourcentage) VALUES (7, 'Muscadelle', 5);
INSERT INTO composition (vin, variete, pourcentage) VALUES (8, 'Merlot', 70);
INSERT INTO composition (vin, variete, pourcentage) VALUES (8, 'Cabernet Franc', 30);


--
-- TOC entry 1964 (class 0 OID 0)
-- Dependencies: 168
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('hibernate_sequence', 25, true);


--
-- TOC entry 1950 (class 0 OID 16585)
-- Dependencies: 169
-- Data for Name: producteur; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO producteur (id, nom) VALUES (1, 'Domaine de la Romanée Conti');
INSERT INTO producteur (id, nom) VALUES (2, 'Domaine Daniel Rion');
INSERT INTO producteur (id, nom) VALUES (3, 'Domaine Gabriel Billard');
INSERT INTO producteur (id, nom) VALUES (4, 'Domaine Marquis d''Angerville');
INSERT INTO producteur (id, nom) VALUES (5, 'Domaine Ramonet');
INSERT INTO producteur (id, nom) VALUES (6, 'Château d''Yquem');
INSERT INTO producteur (id, nom) VALUES (7, 'Château La Tour Blanche');
INSERT INTO producteur (id, nom) VALUES (8, 'Château Hosanna');


--
-- TOC entry 1953 (class 0 OID 16605)
-- Dependencies: 172
-- Data for Name: region; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO region (id, nom, pays) VALUES (1, 'Côte de Nuits', 'France');
INSERT INTO region (id, nom, pays) VALUES (2, 'Côte de Beaune', 'France');
INSERT INTO region (id, nom, pays) VALUES (3, 'Sauternes', 'France');
INSERT INTO region (id, nom, pays) VALUES (4, 'Libournais', 'France');


--
-- TOC entry 1951 (class 0 OID 16590)
-- Dependencies: 170
-- Data for Name: vin; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (1, '1999 Domaine Romanee Conti La Tache', 1999, 1, 1, 'rouge');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (2, '2005 Domaine Daniel Rion Le Vaucrain, Côte de Nuits-Villages', 2005, 2, 2, 'rouge');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (3, '2005 Domaine Gabriel Billard "Milliane" Bourgogne Rouge', 2005, 3, NULL, 'rouge');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (4, '1996 Marquis d''Angerville Volnay Champans', 1996, 4, 3, 'rouge');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (5, '1999 Domaine Ramonet Chassagne-Montrachet "Morgeot"', 1999, 5, 4, 'blanc');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (8, 'Château Hosanna 2005 Pomerol', 2005, 8, 5, 'rouge');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (6, '1990 Château d''Yquem Sauternes', 1990, 6, 6, 'blanc');
INSERT INTO vin (id, nom, annee, producteur, appellation, couleur) VALUES (7, '1998 Château La Tour Blanche Sauternes Sémillon', 1998, 7, 6, 'blanc');


--
-- TOC entry 1940 (class 2606 OID 16604)
-- Name: appellation_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY appellation
    ADD CONSTRAINT appellation_pkey PRIMARY KEY (id);


--
-- TOC entry 1946 (class 2606 OID 16633)
-- Name: composition_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY composition
    ADD CONSTRAINT composition_pkey PRIMARY KEY (vin, variete);


--
-- TOC entry 1936 (class 2606 OID 16589)
-- Name: producteur_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY producteur
    ADD CONSTRAINT producteur_pkey PRIMARY KEY (id);


--
-- TOC entry 1942 (class 2606 OID 16614)
-- Name: region_nom_pays_key; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY region
    ADD CONSTRAINT region_nom_pays_key UNIQUE (nom, pays);


--
-- TOC entry 1944 (class 2606 OID 16612)
-- Name: region_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY region
    ADD CONSTRAINT region_pkey PRIMARY KEY (id);


--
-- TOC entry 1938 (class 2606 OID 16594)
-- Name: vin_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY vin
    ADD CONSTRAINT vin_pkey PRIMARY KEY (id);


--
-- TOC entry 1948 (class 2606 OID 16639)
-- Name: composition_vin_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY composition
    ADD CONSTRAINT composition_vin_fkey FOREIGN KEY (vin) REFERENCES vin(id);


--
-- TOC entry 1947 (class 2606 OID 16654)
-- Name: vin_producteur_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY vin
    ADD CONSTRAINT vin_producteur_fkey FOREIGN KEY (producteur) REFERENCES producteur(id);


-- Completed on 2013-09-22 15:15:46

--
-- PostgreSQL database dump complete
--

