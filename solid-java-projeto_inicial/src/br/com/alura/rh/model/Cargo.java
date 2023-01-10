package br.com.alura.rh.model;

public enum Cargo {

    ASSISTENTE {
        @Override
        public Cargo getProximoCargo() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public Cargo getProximoCargo() {
            return ESPECIALISTA;
        }
    },
    ESPECIALISTA {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public Cargo getProximoCargo() {
            return GERENTE;
        }
    };

    //Um método abstrato força as constantes a implementarem o método
    public abstract Cargo getProximoCargo();
}
