package X;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class DNR extends HashMap<String, String> {
    public final /* synthetic */ DNO this$0;
    public final /* synthetic */ String val$dataJson;
    public final /* synthetic */ String val$flagsJson;

    public DNR(DNO dno, String str, String str2) {
        this.val$dataJson = str;
        this.val$flagsJson = str2;
        this.this$0 = dno;
        put("data", str);
        put("flags", str2);
        DNO dno2 = DNO.A08;
        put("device_id", dno.A00);
    }
}
