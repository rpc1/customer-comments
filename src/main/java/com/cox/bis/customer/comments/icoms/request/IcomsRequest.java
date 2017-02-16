package com.cox.bis.customer.comments.icoms.request;

import java.math.BigDecimal;
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
		 "mac00141"
})
@XmlRootElement(name = "ICOMS")
public class IcomsRequest {
	@XmlElement(name = "MAC00141")
    protected IcomsRequest.MAC00141 mac00141;
	@XmlAttribute(name = "USERID", required = true)
    protected String userid;
    @XmlAttribute(name = "PASSWORD", required = true)
    protected String password;
    @XmlAttribute(name = "ENVIRONMENT", required = true)
    protected String environment;
	
	public IcomsRequest.MAC00141 getMAC00141() {
        return mac00141;
    }

    public void setMAC00141(IcomsRequest.MAC00141 value) {
        this.mac00141 = value;
    }
    
    public String getUSERID() {
        return userid;
    }

    public void setUSERID(String value) {
        this.userid = value;
    }
    
    public String getPASSWORD() {
        return password;
    }

    public void setPASSWORD(String value) {
        this.password = value;
    }
    
    public String getENVIRONMENT() {
        return environment;
    }

    public void setENVIRONMENT(String value) {
        this.environment = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inl01000",
        "inl01001",
        "inl01002",
        "inl01003",
        "inl00864"
    })
    public static class MAC00141 {

        @XmlElement(name = "INL01000")
        protected List<IcomsRequest.MAC00141 .INL01000> inl01000;
        @XmlElement(name = "INL01001")
        protected List<IcomsRequest.MAC00141 .INL01001> inl01001;
        @XmlElement(name = "INL01002")
        protected List<IcomsRequest.MAC00141 .INL01002> inl01002;
        @XmlElement(name = "INL01003")
        protected List<IcomsRequest.MAC00141 .INL01003> inl01003;
        @XmlElement(name = "INL00864")
        protected List<IcomsRequest.MAC00141 .INL00864> inl00864;
        @XmlAttribute(name = "SITEID", required = true)
        protected BigInteger siteid;
        @XmlAttribute(name = "ACNTNMBR", required = true)
        protected BigInteger acntnmbr;

        
        public List<IcomsRequest.MAC00141 .INL01000> getINL01000() {
            if (inl01000 == null) {
                inl01000 = new ArrayList<IcomsRequest.MAC00141 .INL01000>();
            }
            return this.inl01000;
        }

        
        public List<IcomsRequest.MAC00141 .INL01001> getINL01001() {
            if (inl01001 == null) {
                inl01001 = new ArrayList<IcomsRequest.MAC00141 .INL01001>();
            }
            return this.inl01001;
        }

        
        public List<IcomsRequest.MAC00141 .INL01002> getINL01002() {
            if (inl01002 == null) {
                inl01002 = new ArrayList<IcomsRequest.MAC00141 .INL01002>();
            }
            return this.inl01002;
        }

        
        public List<IcomsRequest.MAC00141 .INL01003> getINL01003() {
            if (inl01003 == null) {
                inl01003 = new ArrayList<IcomsRequest.MAC00141 .INL01003>();
            }
            return this.inl01003;
        }

        
        public List<IcomsRequest.MAC00141 .INL00864> getINL00864() {
            if (inl00864 == null) {
                inl00864 = new ArrayList<IcomsRequest.MAC00141 .INL00864>();
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
        @XmlType(name = "")
        public static class INL00864 {

            @XmlAttribute(name = "TRVRSLEVL")
            protected BigInteger trvrslevl;

            
            public BigInteger getTRVRSLEVL() {
                return trvrslevl;
            }

            
            public void setTRVRSLEVL(BigInteger value) {
                this.trvrslevl = value;
            }

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01000 {

            @XmlAttribute(name = "CMNTLINE", required = true)
            protected String cmntline;
            @XmlAttribute(name = "CMNTEXPRTNDATE")
            protected BigInteger cmntexprtndate;
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

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01002 {

            @XmlAttribute(name = "CMNTENTRDDATE", required = true)
            protected BigInteger cmntentrddate;
            @XmlAttribute(name = "CMNTSQNCNMBR", required = true)
            protected BigInteger cmntsqncnmbr;

            
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

        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class INL01003 {

            @XmlAttribute(name = "FROMCMNTENTRDDATE", required = true)
            protected BigInteger fromcmntentrddate;
            @XmlAttribute(name = "FROMCMNTSQNCNMBR")
            protected BigInteger fromcmntsqncnmbr;
            @XmlAttribute(name = "PAGESIZE")
            protected BigInteger pagesize;

            
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

        }

    }
}