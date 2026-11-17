package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class GKV implements GLJ {
    public final GJO A00;
    public final GKP A01;
    public final AbstractC9321GEc A02;
    public final C6966EdO A03;
    public final Integer A04;
    public final String A05;

    public static GKV A00(GJO typeUrl, GKP value, AbstractC9321GEc keyMaterialType, Integer outputPrefixType, String idRequirement) throws GeneralSecurityException {
        if (value == GKP.RAW) {
            if (outputPrefixType != null) {
                throw BV6.A0u("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (outputPrefixType == null) {
            throw BV6.A0u("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new GKV(typeUrl, value, keyMaterialType, AbstractC10509Hny.A00(idRequirement), outputPrefixType, idRequirement);
    }

    @Override // X.GLJ
    public final C6966EdO AIC() {
        return this.A03;
    }

    public GKV(GJO typeUrl, GKP objectIdentifier, AbstractC9321GEc value, C6966EdO keyMaterialType, Integer outputPrefixType, String idRequirement) {
        this.A05 = idRequirement;
        this.A03 = keyMaterialType;
        this.A02 = value;
        this.A00 = typeUrl;
        this.A01 = objectIdentifier;
        this.A04 = outputPrefixType;
    }
}
