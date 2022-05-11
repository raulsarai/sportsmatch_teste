package br.com.myapplication.api.dto;

import java.util.List;

    public class RecursosDto {

        private int status;
        private List<Object> object = null;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<Object> getObject() {
            return object;
        }

        public void setObject(List<Object> object) {
            this.object = object;
        }

    }
