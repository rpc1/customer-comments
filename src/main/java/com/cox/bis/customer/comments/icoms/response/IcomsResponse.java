package com.cox.bis.customer.comments.icoms.response;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "error",
    "mac00141"
})
@XmlRootElement(name = "ICOMS")
public class IcomsResponse {
	
	@XmlElement(name = "ERROR")
    protected ERROR error;
	@XmlElement(name = "MAC00141")
    protected IcomsResponse.MAC00141 mac00141;

    public ERROR getERROR() {
        return error;
    }
    
    public void setERROR(ERROR value) {
        this.error = value;
    }
    
    public IcomsResponse.MAC00141 getMAC00141() {
        return mac00141;
    }

    
    public void setMAC00141(IcomsResponse.MAC00141 value) {
        this.mac00141 = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "error",
        "inl01000",
        "inl01001",
        "inl01002",
        "inl01003",
        "inl00864"
    })
    public static class MAC00141 {

        @XmlElement(name = "ERROR")
        protected ERROR error;
        @XmlElement(name = "INL01000")
        protected List<IcomsResponse.MAC00141 .INL01000> inl01000;
        @XmlElement(name = "INL01001")
        protected List<IcomsResponse.MAC00141 .INL01001> inl01001;
        @XmlElement(name = "INL01002")
        protected List<IcomsResponse.MAC00141 .INL01002> inl01002;
        @XmlElement(name = "INL01003")
        protected List<IcomsResponse.MAC00141 .INL01003> inl01003;
        @XmlElement(name = "INL00864")
        protected List<IcomsResponse.MAC00141 .INL00864> inl00864;
        @XmlAttribute(name = "SITEID", required = true)
        protected BigInteger siteid;
        @XmlAttribute(name = "ACNTNMBR", required = true)
        protected BigInteger acntnmbr;

        
        public ERROR getERROR() {
            return error;
        }

        
        public void setERROR(ERROR value) {
            this.error = value;
        }

        
        public List<IcomsResponse.MAC00141 .INL01000> getINL01000() {
            if (inl01000 == null) {
                inl01000 = new ArrayList<IcomsResponse.MAC00141 .INL01000>();
            }
            return this.inl01000;
        }

        
        public List<IcomsResponse.MAC00141 .INL01001> getINL01001() {
            if (inl01001 == null) {
                inl01001 = new ArrayList<IcomsResponse.MAC00141 .INL01001>();
            }
            return this.inl01001;
        }

        
        public List<IcomsResponse.MAC00141 .INL01002> getINL01002() {
            if (inl01002 == null) {
                inl01002 = new ArrayList<IcomsResponse.MAC00141 .INL01002>();
            }
            return this.inl01002;
        }

        
        public List<IcomsResponse.MAC00141 .INL01003> getINL01003() {
            if (inl01003 == null) {
                inl01003 = new ArrayList<IcomsResponse.MAC00141 .INL01003>();
            }
            return this.inl01003;
        }

        
        public List<IcomsResponse.MAC00141 .INL00864> getINL00864() {
            if (inl00864 == null) {
                inl00864 = new ArrayList<IcomsResponse.MAC00141 .INL00864>();
            }
            return this.inl00864;
        }

        
        public BigInteger getSITEID() {
            return siteid;
        }

        
        public void setSITEID(BigInteger value) {
            this.siteid = value;
        }

        
        public BigInteger getACNTNMBR() {
            return acntnmbr;
        }

        
        public void setACNTNMBR(BigInteger value) {
            this.acntnmbr = value;
        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inl00865"
        })
        public static class INL00864 {

            @XmlElement(name = "INL00865")
            protected List<IcomsResponse.MAC00141 .INL00864 .INL00865> inl00865;
            @XmlAttribute(name = "TRVRSLEVL")
            protected BigInteger trvrslevl;

            
            public List<IcomsResponse.MAC00141 .INL00864 .INL00865> getINL00865() {
                if (inl00865 == null) {
                    inl00865 = new ArrayList<IcomsResponse.MAC00141 .INL00864 .INL00865>();
                }
                return this.inl00865;
            }

            
            public BigInteger getTRVRSLEVL() {
                return trvrslevl;
            }

            
            public void setTRVRSLEVL(BigInteger value) {
                this.trvrslevl = value;
            }


            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class INL00865 {

                @XmlAttribute(name = "LNKDACNT")
                protected BigInteger lnkdacnt;
                @XmlAttribute(name = "LNKDCSTMRNAME")
                protected String lnkdcstmrname;

                
                public BigInteger getLNKDACNT() {
                    return lnkdacnt;
                }

                
                public void setLNKDACNT(BigInteger value) {
                    this.lnkdacnt = value;
                }

                
                public String getLNKDCSTMRNAME() {
                    return lnkdcstmrname;
                }

                
                public void setLNKDCSTMRNAME(String value) {
                    this.lnkdcstmrname = value;
                }

            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01000 {

            @XmlAttribute(name = "CMNTLINE", required = true)
            protected String cmntline;
            @XmlAttribute(name = "CMNTEXPRTNDATE")
            protected BigInteger cmntexprtndate;
            @XmlAttribute(name = "CMNTENTRDDATE")
            protected BigInteger cmntentrddate;
            @XmlAttribute(name = "CMNTSQNCNMBR")
            protected BigInteger cmntsqncnmbr;
            @XmlAttribute(name = "CMNTTRNSCTNSQNC")
            protected BigInteger cmnttrnsctnsqnc;
            @XmlAttribute(name = "INLNRTRNCODE")
            protected String inlnrtrncode;
            @XmlAttribute(name = "INLNMESGTEXT")
            protected String inlnmesgtext;
            @XmlAttribute(name = "MASSADDCMNTSFLAG")
            protected String massaddcmntsflag;

            
            public String getCMNTLINE() {
                return cmntline;
            }

            
            public void setCMNTLINE(String value) {
                this.cmntline = value;
            }

            
            public BigInteger getCMNTEXPRTNDATE() {
                return cmntexprtndate;
            }

            
            public void setCMNTEXPRTNDATE(BigInteger value) {
                this.cmntexprtndate = value;
            }

            
            public BigInteger getCMNTENTRDDATE() {
                return cmntentrddate;
            }

            
            public void setCMNTENTRDDATE(BigInteger value) {
                this.cmntentrddate = value;
            }

            
            public BigInteger getCMNTSQNCNMBR() {
                return cmntsqncnmbr;
            }

            
            public void setCMNTSQNCNMBR(BigInteger value) {
                this.cmntsqncnmbr = value;
            }

            
            public BigInteger getCMNTTRNSCTNSQNC() {
                return cmnttrnsctnsqnc;
            }

            
            public void setCMNTTRNSCTNSQNC(BigInteger value) {
                this.cmnttrnsctnsqnc = value;
            }

            
            public String getINLNRTRNCODE() {
                return inlnrtrncode;
            }

            
            public void setINLNRTRNCODE(String value) {
                this.inlnrtrncode = value;
            }

            
            public String getINLNMESGTEXT() {
                return inlnmesgtext;
            }

            
            public void setINLNMESGTEXT(String value) {
                this.inlnmesgtext = value;
            }

            
            public String getMASSADDCMNTSFLAG() {
                return massaddcmntsflag;
            }

            
            public void setMASSADDCMNTSFLAG(String value) {
                this.massaddcmntsflag = value;
            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01001 {

            @XmlAttribute(name = "CMNTENTRDDATE", required = true)
            protected BigInteger cmntentrddate;
            @XmlAttribute(name = "CMNTSQNCNMBR", required = true)
            protected BigInteger cmntsqncnmbr;
            @XmlAttribute(name = "CMNTLINE", required = true)
            protected String cmntline;
            @XmlAttribute(name = "CMNTEXPRTNDATE")
            protected BigInteger cmntexprtndate;
            @XmlAttribute(name = "INLNRTRNCODE")
            protected String inlnrtrncode;
            @XmlAttribute(name = "INLNMESGTEXT")
            protected String inlnmesgtext;

            
            public BigInteger getCMNTENTRDDATE() {
                return cmntentrddate;
            }

            
            public void setCMNTENTRDDATE(BigInteger value) {
                this.cmntentrddate = value;
            }

            
            public BigInteger getCMNTSQNCNMBR() {
                return cmntsqncnmbr;
            }

            
            public void setCMNTSQNCNMBR(BigInteger value) {
                this.cmntsqncnmbr = value;
            }

            
            public String getCMNTLINE() {
                return cmntline;
            }

            
            public void setCMNTLINE(String value) {
                this.cmntline = value;
            }

            
            public BigInteger getCMNTEXPRTNDATE() {
                return cmntexprtndate;
            }

            
            public void setCMNTEXPRTNDATE(BigInteger value) {
                this.cmntexprtndate = value;
            }

            
            public String getINLNRTRNCODE() {
                return inlnrtrncode;
            }

            
            public void setINLNRTRNCODE(String value) {
                this.inlnrtrncode = value;
            }

            
            public String getINLNMESGTEXT() {
                return inlnmesgtext;
            }

            
            public void setINLNMESGTEXT(String value) {
                this.inlnmesgtext = value;
            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01002 {

            @XmlAttribute(name = "CMNTENTRDDATE", required = true)
            protected BigInteger cmntentrddate;
            @XmlAttribute(name = "CMNTSQNCNMBR", required = true)
            protected BigInteger cmntsqncnmbr;
            @XmlAttribute(name = "INLNRTRNCODE")
            protected String inlnrtrncode;
            @XmlAttribute(name = "INLNMESGTEXT")
            protected String inlnmesgtext;

            
            public BigInteger getCMNTENTRDDATE() {
                return cmntentrddate;
            }

            
            public void setCMNTENTRDDATE(BigInteger value) {
                this.cmntentrddate = value;
            }

            
            public BigInteger getCMNTSQNCNMBR() {
                return cmntsqncnmbr;
            }

            
            public void setCMNTSQNCNMBR(BigInteger value) {
                this.cmntsqncnmbr = value;
            }

            
            public String getINLNRTRNCODE() {
                return inlnrtrncode;
            }

            
            public void setINLNRTRNCODE(String value) {
                this.inlnrtrncode = value;
            }

            
            public String getINLNMESGTEXT() {
                return inlnmesgtext;
            }

            
            public void setINLNMESGTEXT(String value) {
                this.inlnmesgtext = value;
            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inl01004"
        })
        public static class INL01003 {

            @XmlElement(name = "INL01004")
            protected List<IcomsResponse.MAC00141 .INL01003 .INL01004> inl01004;
            @XmlAttribute(name = "FROMCMNTENTRDDATE", required = true)
            protected BigInteger fromcmntentrddate;
            @XmlAttribute(name = "FROMCMNTSQNCNMBR")
            protected BigInteger fromcmntsqncnmbr;
            @XmlAttribute(name = "PAGESIZE")
            protected BigInteger pagesize;
            @XmlAttribute(name = "NEXTCMNTENTRDDATE")
            protected BigInteger nextcmntentrddate;
            @XmlAttribute(name = "NEXTCMNTSQNCNMBR")
            protected BigInteger nextcmntsqncnmbr;

            
            public List<IcomsResponse.MAC00141 .INL01003 .INL01004> getINL01004() {
                if (inl01004 == null) {
                    inl01004 = new ArrayList<IcomsResponse.MAC00141 .INL01003 .INL01004>();
                }
                return this.inl01004;
            }

            
            public BigInteger getFROMCMNTENTRDDATE() {
                return fromcmntentrddate;
            }

            
            public void setFROMCMNTENTRDDATE(BigInteger value) {
                this.fromcmntentrddate = value;
            }

            
            public BigInteger getFROMCMNTSQNCNMBR() {
                return fromcmntsqncnmbr;
            }

            
            public void setFROMCMNTSQNCNMBR(BigInteger value) {
                this.fromcmntsqncnmbr = value;
            }

            
            public BigInteger getPAGESIZE() {
                return pagesize;
            }

            
            public void setPAGESIZE(BigInteger value) {
                this.pagesize = value;
            }

            
            public BigInteger getNEXTCMNTENTRDDATE() {
                return nextcmntentrddate;
            }

            
            public void setNEXTCMNTENTRDDATE(BigInteger value) {
                this.nextcmntentrddate = value;
            }

            
            public BigInteger getNEXTCMNTSQNCNMBR() {
                return nextcmntsqncnmbr;
            }

            
            public void setNEXTCMNTSQNCNMBR(BigInteger value) {
                this.nextcmntsqncnmbr = value;
            }


            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class INL01004 {

                @XmlAttribute(name = "CMNTENTRDDATE")
                protected BigInteger cmntentrddate;
                @XmlAttribute(name = "CMNTSQNCNMBR")
                protected BigInteger cmntsqncnmbr;
                @XmlAttribute(name = "CMNTLINE")
                protected String cmntline;
                @XmlAttribute(name = "CMNTEXPRTNDATE")
                protected BigInteger cmntexprtndate;
                @XmlAttribute(name = "CMNTTRNSCTNSQNC")
                protected BigInteger cmnttrnsctnsqnc;
                @XmlAttribute(name = "USERID")
                protected String userid;

                
                public BigInteger getCMNTENTRDDATE() {
                    return cmntentrddate;
                }

                
                public void setCMNTENTRDDATE(BigInteger value) {
                    this.cmntentrddate = value;
                }

                
                public BigInteger getCMNTSQNCNMBR() {
                    return cmntsqncnmbr;
                }

                
                public void setCMNTSQNCNMBR(BigInteger value) {
                    this.cmntsqncnmbr = value;
                }

                
                public String getCMNTLINE() {
                    return cmntline;
                }

                
                public void setCMNTLINE(String value) {
                    this.cmntline = value;
                }

                
                public BigInteger getCMNTEXPRTNDATE() {
                    return cmntexprtndate;
                }

                
                public void setCMNTEXPRTNDATE(BigInteger value) {
                    this.cmntexprtndate = value;
                }

                
                public BigInteger getCMNTTRNSCTNSQNC() {
                    return cmnttrnsctnsqnc;
                }

                
                public void setCMNTTRNSCTNSQNC(BigInteger value) {
                    this.cmnttrnsctnsqnc = value;
                }

                
                public String getUSERID() {
                    return userid;
                }

                
                public void setUSERID(String value) {
                    this.userid = value;
                }

            }

        }

    }

}
