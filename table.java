package projectpl;

public class table 
{
    private String domainName;
    private String ipAddress;
    
    public table(String domainName, String ipAddress) {
        this.domainName = domainName;
        this.ipAddress = ipAddress;
    }
    
    public table()
    {
        
    }
    
    public String getDomainName() {
        return domainName;
    }

    public String getIpAddress() {
        return ipAddress;
    }
    
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
}