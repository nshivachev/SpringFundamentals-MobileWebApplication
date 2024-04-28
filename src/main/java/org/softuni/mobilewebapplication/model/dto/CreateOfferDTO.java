package org.softuni.mobilewebapplication.model.dto;

import jakarta.validation.constraints.*;
import org.softuni.mobilewebapplication.model.enums.EngineEnum;
import org.softuni.mobilewebapplication.model.enums.TransmissionEnum;
import org.softuni.mobilewebapplication.model.validation.YearNotInTheFuture;

import java.math.BigDecimal;

public final class CreateOfferDTO {

        private @Positive @NotNull Long modelId;
        private @Positive @NotNull BigDecimal price;
        private @NotNull EngineEnum engine;
        private @NotNull TransmissionEnum transmission;
        private @NotNull(message = "Year must be provided") @Min(1930) @YearNotInTheFuture(message = "The year should not be in the future!") Integer year;
        private @Positive @NotNull int mileage;
        private @NotEmpty @Size(min = 5, max = 512) String description;
        private @NotEmpty String imageUrl;

        public Long getModelId() {
                return modelId;
        }

        public void setModelId(Long modelId) {
                this.modelId = modelId;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public EngineEnum getEngine() {
                return engine;
        }

        public void setEngine(EngineEnum engine) {
                this.engine = engine;
        }

        public TransmissionEnum getTransmission() {
                return transmission;
        }

        public void setTransmission(TransmissionEnum transmission) {
                this.transmission = transmission;
        }

        public Integer getYear() {
                return year;
        }

        public void setYear(Integer year) {
                this.year = year;
        }

        public int getMileage() {
                return mileage;
        }

        public void setMileage(Integer mileage) {
                this.mileage = mileage;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }
}
