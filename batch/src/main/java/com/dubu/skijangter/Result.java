package com.dubu.skijangter;

/**
 * User: dubu9
 * Date: 14. 5. 11
 * Time: 오전 10:17
 */
public class Result {

    Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public class Weather {

        Forecast6days forecast6days;


        private Forecast6days getForecast6days() {
            return forecast6days;
        }

        private void setForecast6days(Forecast6days forecast6days) {
            this.forecast6days = forecast6days;
        }

        public class Forecast6days {

            Sky sky;

            private Sky getSky() {
                return sky;
            }

            private void setSky(Sky sky) {
                this.sky = sky;
            }

            public class Sky {

                String  amCode2day;
                String  amName2day;
                String  pmCode2day;
                String  pmName2day;

                String  amCode3day;
                String  amName3day;
                String  pmCode3day;
                String  pmName3day;

                String  amCode4day;
                String  amName4day;
                String  pmCode4day;
                String  pmName4day;

                String  amCode5day;
                String  amName5day;
                String  pmCode5day;
                String  pmName5day;

                String  amCode6day;
                String  amName6day;
                String  pmCode6day;
                String  pmName6day;

                String  amCode7day;
                String  amName7day;
                String  pmCode7day;
                String  pmName7day;

                private String getAmCode2day() {
                    return amCode2day;
                }

                private void setAmCode2day(String amCode2day) {
                    this.amCode2day = amCode2day;
                }

                private String getAmName2day() {
                    return amName2day;
                }

                private void setAmName2day(String amName2day) {
                    this.amName2day = amName2day;
                }

                private String getPmCode2day() {
                    return pmCode2day;
                }

                private void setPmCode2day(String pmCode2day) {
                    this.pmCode2day = pmCode2day;
                }

                private String getPmName2day() {
                    return pmName2day;
                }

                private void setPmName2day(String pmName2day) {
                    this.pmName2day = pmName2day;
                }

                private String getAmCode3day() {
                    return amCode3day;
                }

                private void setAmCode3day(String amCode3day) {
                    this.amCode3day = amCode3day;
                }

                private String getAmName3day() {
                    return amName3day;
                }

                private void setAmName3day(String amName3day) {
                    this.amName3day = amName3day;
                }

                private String getPmCode3day() {
                    return pmCode3day;
                }

                private void setPmCode3day(String pmCode3day) {
                    this.pmCode3day = pmCode3day;
                }

                private String getPmName3day() {
                    return pmName3day;
                }

                private void setPmName3day(String pmName3day) {
                    this.pmName3day = pmName3day;
                }

                private String getAmCode4day() {
                    return amCode4day;
                }

                private void setAmCode4day(String amCode4day) {
                    this.amCode4day = amCode4day;
                }

                private String getAmName4day() {
                    return amName4day;
                }

                private void setAmName4day(String amName4day) {
                    this.amName4day = amName4day;
                }

                private String getPmCode4day() {
                    return pmCode4day;
                }

                private void setPmCode4day(String pmCode4day) {
                    this.pmCode4day = pmCode4day;
                }

                private String getPmName4day() {
                    return pmName4day;
                }

                private void setPmName4day(String pmName4day) {
                    this.pmName4day = pmName4day;
                }

                private String getAmCode5day() {
                    return amCode5day;
                }

                private void setAmCode5day(String amCode5day) {
                    this.amCode5day = amCode5day;
                }

                private String getAmName5day() {
                    return amName5day;
                }

                private void setAmName5day(String amName5day) {
                    this.amName5day = amName5day;
                }

                private String getPmCode5day() {
                    return pmCode5day;
                }

                private void setPmCode5day(String pmCode5day) {
                    this.pmCode5day = pmCode5day;
                }

                private String getPmName5day() {
                    return pmName5day;
                }

                private void setPmName5day(String pmName5day) {
                    this.pmName5day = pmName5day;
                }

                private String getAmCode6day() {
                    return amCode6day;
                }

                private void setAmCode6day(String amCode6day) {
                    this.amCode6day = amCode6day;
                }

                private String getAmName6day() {
                    return amName6day;
                }

                private void setAmName6day(String amName6day) {
                    this.amName6day = amName6day;
                }

                private String getPmCode6day() {
                    return pmCode6day;
                }

                private void setPmCode6day(String pmCode6day) {
                    this.pmCode6day = pmCode6day;
                }

                private String getPmName6day() {
                    return pmName6day;
                }

                private void setPmName6day(String pmName6day) {
                    this.pmName6day = pmName6day;
                }

                private String getAmCode7day() {
                    return amCode7day;
                }

                private void setAmCode7day(String amCode7day) {
                    this.amCode7day = amCode7day;
                }

                private String getAmName7day() {
                    return amName7day;
                }

                private void setAmName7day(String amName7day) {
                    this.amName7day = amName7day;
                }

                private String getPmCode7day() {
                    return pmCode7day;
                }

                private void setPmCode7day(String pmCode7day) {
                    this.pmCode7day = pmCode7day;
                }

                private String getPmName7day() {
                    return pmName7day;
                }

                private void setPmName7day(String pmName7day) {
                    this.pmName7day = pmName7day;
                }


                //                "amCode2day":"SKY_W13",
//                "amName2day":"흐리고 눈",
//                "pmCode2day":"SKY_W03",
//                "pmName2day":"구름많음",
//                "amCode3day":"SKY_W03",
//                "amName3day":"구름많음",
//                "pmCode3day":"SKY_W12",
//                "pmName3day":"구름많고 눈",
//                "amCode4day":"SKY_W02",
//                "amName4day":"구름조금",
//                "pmCode4day":"SKY_W02",
//                "pmName4day":"구름조금",
//                "amCode5day":"SKY_W03",
//                "amName5day":"구름많음",
//                "pmCode5day":"SKY_W02",
//                "pmName5day":"구름조금",
//                "amCode6day":"SKY_W02",
//                "amName6day":"구름조금",
//                "pmCode6day":"SKY_W02",
//                "pmName6day":"구름조금",
//                "amCode7day":"SKY_W02",
//                "amName7day":"구름조금",
//                "pmCode7day":"SKY_W02",
//                "pmName7day":"구름조금"

            }
        }
    }
}
