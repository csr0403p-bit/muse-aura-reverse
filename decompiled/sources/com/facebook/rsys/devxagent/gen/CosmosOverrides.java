package com.facebook.rsys.devxagent.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CosmosOverrides {
    public static G50<CosmosOverrides> CONVERTER = C8925Fth.A00(2);
    public static long sMcfTypeId;
    public final String cosmosTier;
    public final Boolean enableGenaiUnifiedResponse;
    public final String handshakeRequestJson;
    public final Integer useCase;

    public static native CosmosOverrides createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CosmosOverrides) {
                CosmosOverrides cosmosOverrides = (CosmosOverrides) obj;
                String str = this.handshakeRequestJson;
                String str2 = cosmosOverrides.handshakeRequestJson;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.cosmosTier;
                    String str4 = cosmosOverrides.cosmosTier;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    Boolean bool = this.enableGenaiUnifiedResponse;
                    Boolean bool2 = cosmosOverrides.enableGenaiUnifiedResponse;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool.equals(bool2)) {
                    }
                    Integer num = this.useCase;
                    Integer num2 = cosmosOverrides.useCase;
                    if (num == null) {
                        if (num2 != null) {
                            return false;
                        }
                    } else if (num.equals(num2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.handshakeRequestJson)) + AnonymousClass006.A0G(this.cosmosTier)) * 31) + AnonymousClass006.A0D(this.enableGenaiUnifiedResponse)) * 31) + C3cH.A02(this.useCase);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CosmosOverrides{handshakeRequestJson=");
        sbA0x.append(this.handshakeRequestJson);
        sbA0x.append(",cosmosTier=");
        sbA0x.append(this.cosmosTier);
        sbA0x.append(",enableGenaiUnifiedResponse=");
        sbA0x.append(this.enableGenaiUnifiedResponse);
        sbA0x.append(",useCase=");
        return BV8.A0v(this.useCase, sbA0x);
    }

    public CosmosOverrides(String str, String str2, Boolean bool, Integer num) {
        this.handshakeRequestJson = str;
        this.cosmosTier = str2;
        this.enableGenaiUnifiedResponse = bool;
        this.useCase = num;
    }
}
