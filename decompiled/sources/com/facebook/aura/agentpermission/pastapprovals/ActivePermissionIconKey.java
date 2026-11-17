package com.facebook.aura.agentpermission.pastapprovals;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ActivePermissionIconKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivePermissionIconKey[] $VALUES;
    public static final ActivePermissionIconKey BROWSER;
    public static final ActivePermissionIconKey CHECKOUT;
    public static final ActivePermissionIconKey CONNECTOR;
    public static final Companion Companion;
    public static final ActivePermissionIconKey DEVICE;
    public static final ActivePermissionIconKey MEDIA;
    public static final ActivePermissionIconKey NETWORK;
    public static final ActivePermissionIconKey TOOL;
    public final String wireValue;

    static {
        ActivePermissionIconKey activePermissionIconKey = new ActivePermissionIconKey("NETWORK", 0, "network");
        NETWORK = activePermissionIconKey;
        ActivePermissionIconKey activePermissionIconKey2 = new ActivePermissionIconKey("CONNECTOR", 1, InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR);
        CONNECTOR = activePermissionIconKey2;
        ActivePermissionIconKey activePermissionIconKey3 = new ActivePermissionIconKey("BROWSER", 2, "browser");
        BROWSER = activePermissionIconKey3;
        ActivePermissionIconKey activePermissionIconKey4 = new ActivePermissionIconKey("TOOL", 3, "tool");
        TOOL = activePermissionIconKey4;
        ActivePermissionIconKey activePermissionIconKey5 = new ActivePermissionIconKey("CHECKOUT", 4, "checkout");
        CHECKOUT = activePermissionIconKey5;
        ActivePermissionIconKey activePermissionIconKey6 = new ActivePermissionIconKey("MEDIA", 5, HatchFileOperations.LibraryPreset.media);
        MEDIA = activePermissionIconKey6;
        ActivePermissionIconKey activePermissionIconKey7 = new ActivePermissionIconKey(ReportField.DEVICE, 6, "device");
        DEVICE = activePermissionIconKey7;
        ActivePermissionIconKey[] activePermissionIconKeyArr = {activePermissionIconKey, activePermissionIconKey2, activePermissionIconKey3, activePermissionIconKey4, activePermissionIconKey5, activePermissionIconKey6, activePermissionIconKey7};
        $VALUES = activePermissionIconKeyArr;
        $ENTRIES = C3cG.A0w(activePermissionIconKeyArr);
        Companion = new Companion();
    }

    public final class Companion {
        public Companion() {
        }

        public final ActivePermissionIconKey fromWire(String str) {
            ActivePermissionIconKey next;
            Iterator<ActivePermissionIconKey> it = ActivePermissionIconKey.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static Ey9<ActivePermissionIconKey> getEntries() {
        return $ENTRIES;
    }

    public static ActivePermissionIconKey valueOf(String str) {
        return (ActivePermissionIconKey) Enum.valueOf(ActivePermissionIconKey.class, str);
    }

    public static ActivePermissionIconKey[] values() {
        return (ActivePermissionIconKey[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ActivePermissionIconKey(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
