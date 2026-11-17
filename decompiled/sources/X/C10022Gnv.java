package X;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/* renamed from: X.Gnv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10022Gnv extends C9935Gle {
    @Override // X.C9935Gle
    public final C9914Gl4 A03(C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI, InterfaceC10159GqS interfaceC10159GqS) {
        C9914Gl4 c9914Gl4A01 = C9935Gle.A01(abstractC9870GjI, null);
        if (c9914Gl4A01 != null) {
            return c9914Gl4A01;
        }
        JsonDeserialize jsonDeserialize = (JsonDeserialize) abstractC9870GjI._class.getAnnotation(JsonDeserialize.class);
        return (jsonDeserialize == null || jsonDeserialize.using() == null) ? super.A03(c9898Gke, abstractC9870GjI, interfaceC10159GqS) : A05(abstractC9870GjI, c9898Gke, interfaceC10159GqS);
    }

    @Override // X.C9935Gle
    public final C9914Gl4 A04(AbstractC9870GjI abstractC9870GjI, C9963Gma c9963Gma, InterfaceC10159GqS interfaceC10159GqS) {
        C9914Gl4 c9914Gl4A01 = C9935Gle.A01(abstractC9870GjI, null);
        if (c9914Gl4A01 != null) {
            return c9914Gl4A01;
        }
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC9870GjI._class.getAnnotation(JsonSerialize.class);
        return (jsonSerialize == null || jsonSerialize.using() == null) ? super.A04(abstractC9870GjI, c9963Gma, interfaceC10159GqS) : A05(abstractC9870GjI, c9963Gma, interfaceC10159GqS);
    }
}
