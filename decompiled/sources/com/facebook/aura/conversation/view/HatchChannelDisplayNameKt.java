package com.facebook.aura.conversation.view;

import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFM;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.model.HatchMessageChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchChannelDisplayNameKt {
    public static final String channelDisplayName(HatchMessageChannel hatchMessageChannel, String str, BFM bfm, int i, int i2) {
        int i3;
        C7384Etj.A0Y(hatchMessageChannel, 0);
        if ((i2 & 2) != 0) {
            str = null;
        }
        int iOrdinal = hatchMessageChannel.ordinal();
        if (iOrdinal == 0) {
            i3 = R.string._name_removed__res_0x7f12022c;
        } else if (iOrdinal == 1) {
            i3 = R.string._name_removed__res_0x7f120229;
        } else if (iOrdinal == 2) {
            i3 = R.string._name_removed__res_0x7f120228;
        } else if (iOrdinal == 3) {
            i3 = R.string._name_removed__res_0x7f12022b;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.string._name_removed__res_0x7f12022a;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, i3);
        if (str == null) {
            AnonymousClass003.A0l(bfm, 853987203);
        } else {
            bfm.AgE(853987204);
            String strA0w = AnonymousClass006.A0w(bfm, strA01, str, R.string._name_removed__res_0x7f120227);
            AnonymousClass001.A1D(bfm);
            if (strA0w != null) {
                return strA0w;
            }
        }
        return strA01;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMessageChannel.values().length];
            try {
                AnonymousClass002.A13(HatchMessageChannel.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMessageChannel.MESSENGER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchMessageChannel.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchMessageChannel.THREADS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchMessageChannel.TELEGRAM, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    public static final String displayAccountUsername(HatchSessionItem hatchSessionItem, List<HatchSessionItem> list) {
        ?? A1a = AnonymousClass002.A1a(hatchSessionItem, list);
        String str = hatchSessionItem.accountUsername;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<HatchSessionItem> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().channel == hatchSessionItem.channel && (i = i + 1) < 0) {
                AbstractC0885AGm.A13();
                throw F60.createAndThrow();
            }
        }
        if (i > A1a) {
            return str;
        }
        return null;
    }
}
