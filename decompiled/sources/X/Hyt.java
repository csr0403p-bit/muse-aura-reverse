package X;

import java.util.AbstractMap;

/* loaded from: classes6.dex */
public final class Hyt implements InterfaceC10618HzY {
    @Override // X.InterfaceC10618HzY
    public final C10601Hxz AQZ(Object destMapField, Object srcMapField) {
        C10601Hxz c10601HxzA0M = (C10601Hxz) destMapField;
        AbstractMap abstractMap = (AbstractMap) srcMapField;
        if (!abstractMap.isEmpty()) {
            if (!c10601HxzA0M.isMutable) {
                c10601HxzA0M = AbstractC7611F5y.A0M(c10601HxzA0M);
            }
            if (!c10601HxzA0M.isMutable) {
                throw C8j3.A17();
            }
            AbstractC7609F5w.A1R(abstractMap, c10601HxzA0M);
        }
        return c10601HxzA0M;
    }
}
