package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class BYA extends BYP {
    public static final long serialVersionUID = 8765432109876543210L;
    public final Map<String, String> annotations;
    public final String eventDetails;
    public final String eventDomain;
    public final String videoId;

    public BYA(String str, Map map) {
        super(DER.A0G);
        this.videoId = str;
        this.eventDomain = "DAVID_MEDIA_CODEC_ADAPTER_SETTINGS";
        this.eventDetails = "";
        this.annotations = map;
    }
}
