package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class NodeCardAppCache {
    public static final int $stable = 0;
    public static final NodeCardAppCache INSTANCE = new NodeCardAppCache();
    public static final ConcurrentHashMap<NodeCardAppKind, NodeCardAppResolution> cache = new ConcurrentHashMap<>();

    public final NodeCardAppResolution peek(NodeCardAppKind nodeCardAppKind) {
        C7384Etj.A0Y(nodeCardAppKind, 0);
        return cache.get(nodeCardAppKind);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCardAppKind.values().length];
            try {
                AnonymousClass002.A13(NodeCardAppKind.DIALER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCardAppKind.CLOCK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCardAppKind.CONTACTS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final NodeCardAppInfo resolveApp(NodeCardAppKind nodeCardAppKind, Context context) throws PackageManager.NameNotFoundException {
        String str;
        Drawable drawable;
        int iOrdinal = nodeCardAppKind.ordinal();
        if (iOrdinal == 0) {
            DialerApp dialerAppResolveDefaultDialer = CallingCardResolverKt.resolveDefaultDialer(context);
            if (dialerAppResolveDefaultDialer == null) {
                return null;
            }
            str = dialerAppResolveDefaultDialer.label;
            drawable = dialerAppResolveDefaultDialer.icon;
        } else if (iOrdinal == 1) {
            ClockApp clockAppResolveDefaultClockApp = ClockCardResolverKt.resolveDefaultClockApp(context);
            if (clockAppResolveDefaultClockApp == null) {
                return null;
            }
            str = clockAppResolveDefaultClockApp.label;
            drawable = clockAppResolveDefaultClockApp.icon;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            ContactsApp contactsAppResolveDefaultContactsApp = ContactsCardResolverKt.resolveDefaultContactsApp(context);
            if (contactsAppResolveDefaultContactsApp == null) {
                return null;
            }
            str = contactsAppResolveDefaultContactsApp.label;
            drawable = contactsAppResolveDefaultContactsApp.icon;
        }
        return new NodeCardAppInfo(str, drawable);
    }

    public final NodeCardAppResolution resolve(NodeCardAppKind nodeCardAppKind, Context context) {
        NodeCardAppResolution nodeCardAppResolutionPutIfAbsent;
        AnonymousClass003.A0u(nodeCardAppKind, context);
        ConcurrentHashMap<NodeCardAppKind, NodeCardAppResolution> concurrentHashMap = cache;
        NodeCardAppResolution nodeCardAppResolution = concurrentHashMap.get(nodeCardAppKind);
        if (nodeCardAppResolution == null && (nodeCardAppResolutionPutIfAbsent = concurrentHashMap.putIfAbsent(nodeCardAppKind, (nodeCardAppResolution = new NodeCardAppResolution(INSTANCE.resolveApp(nodeCardAppKind, AnonymousClass001.A0I(context)))))) != null) {
            nodeCardAppResolution = nodeCardAppResolutionPutIfAbsent;
        }
        return nodeCardAppResolution;
    }
}
