package com.facebook.aura.payments.cardvalidation;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C06827l3;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C60R;
import X.Ey9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCardNetwork {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCardNetwork[] $VALUES;
    public static final Companion Companion;
    public static final HatchCardNetwork UNKNOWN;
    public final List<Integer> groupSizes;
    public final Set<Integer> panLengths;
    public final C06827l3 prefix;
    public final int securityCodeLength;
    public static final HatchCardNetwork VISA = new HatchCardNetwork("VISA", 0, C06827l3.A02("^4\\d*"), Collections.singleton(16), 3, Arrays.asList(4, 4, 4, 4));
    public static final HatchCardNetwork MASTERCARD = new HatchCardNetwork("MASTERCARD", 1, C06827l3.A02("^(5[1-5]|222[1-9]|22[3-9]\\d|2[3-6]\\d\\d|27[01]\\d|2720)\\d*"), Collections.singleton(16), 3, Arrays.asList(4, 4, 4, 4));
    public static final HatchCardNetwork AMERICAN_EXPRESS = new HatchCardNetwork("AMERICAN_EXPRESS", 2, C06827l3.A02("^3[47]\\d*"), Collections.singleton(15), 4, Arrays.asList(4, 6, 5));
    public static final HatchCardNetwork DISCOVER = new HatchCardNetwork("DISCOVER", 3, C06827l3.A02("^(6011|65|64[4-9]|622)\\d*"), Collections.singleton(16), 3, Arrays.asList(4, 4, 4, 4));
    public static final HatchCardNetwork JCB = new HatchCardNetwork("JCB", 4, C06827l3.A02("^35(2[89]|[3-8]\\d)\\d*"), Collections.singleton(16), 3, Arrays.asList(4, 4, 4, 4));

    public final class Companion {
        public final boolean accepts(String str, List<String> list) {
            boolean zA1a = AnonymousClass002.A1a(str, list);
            HatchCardNetwork hatchCardNetworkForDigits = forDigits(str);
            if (hatchCardNetworkForDigits != HatchCardNetwork.UNKNOWN) {
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    HatchCardNetwork hatchCardNetworkForServerName = HatchCardNetwork.Companion.forServerName(AnonymousClass005.A0j(it));
                    if (hatchCardNetworkForServerName != null) {
                        arrayListA0h.add(hatchCardNetworkForServerName);
                    }
                }
                if (!arrayListA0h.isEmpty() && !arrayListA0h.contains(hatchCardNetworkForDigits)) {
                    return false;
                }
            }
            return zA1a;
        }

        private final HatchCardNetwork forServerName(String str) {
            switch (str.hashCode()) {
                case -1553624974:
                    if (str.equals("MASTERCARD")) {
                        return HatchCardNetwork.MASTERCARD;
                    }
                    return null;
                case 73257:
                    if (str.equals("JCB")) {
                        return HatchCardNetwork.JCB;
                    }
                    return null;
                case 2634817:
                    if (str.equals("VISA")) {
                        return HatchCardNetwork.VISA;
                    }
                    return null;
                case 232055600:
                    if (str.equals("AMERICANEXPRESS")) {
                        return HatchCardNetwork.AMERICAN_EXPRESS;
                    }
                    return null;
                case 1055811561:
                    if (str.equals("DISCOVER")) {
                        return HatchCardNetwork.DISCOVER;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final List<HatchCardNetwork> acceptedNetworks(List<String> list) {
            ArrayList arrayListA0y = C3cI.A0y(list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                HatchCardNetwork hatchCardNetworkForServerName = HatchCardNetwork.Companion.forServerName(AnonymousClass005.A0j(it));
                if (hatchCardNetworkForServerName != null) {
                    arrayListA0y.add(hatchCardNetworkForServerName);
                }
            }
            Set setA0g = AbstractC0878AGe.A0g(arrayListA0y);
            Ey9<HatchCardNetwork> entries = HatchCardNetwork.getEntries();
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchCardNetwork hatchCardNetwork : entries) {
                if (setA0g.contains(hatchCardNetwork)) {
                    arrayListA0h.add(hatchCardNetwork);
                }
            }
            return arrayListA0h;
        }

        public final HatchCardNetwork forDigits(String str) {
            HatchCardNetwork next;
            if (C60R.A02(str) != 0) {
                Iterator<HatchCardNetwork> it = HatchCardNetwork.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    HatchCardNetwork hatchCardNetwork = next;
                    if (hatchCardNetwork != HatchCardNetwork.UNKNOWN && hatchCardNetwork.prefix.A08(str)) {
                        break;
                    }
                }
                HatchCardNetwork hatchCardNetwork2 = next;
                if (hatchCardNetwork2 != null) {
                    return hatchCardNetwork2;
                }
            }
            return HatchCardNetwork.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchCardNetwork hatchCardNetwork = new HatchCardNetwork("UNKNOWN", 5, C06827l3.A02("^$"), BFI.A0H(new Integer[]{13, 14, 15, 16}), 3, Arrays.asList(4, 4, 4, 4));
        UNKNOWN = hatchCardNetwork;
        HatchCardNetwork[] hatchCardNetworkArr = {VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, JCB, hatchCardNetwork};
        $VALUES = hatchCardNetworkArr;
        $ENTRIES = C3cG.A0w(hatchCardNetworkArr);
        Companion = new Companion();
    }

    public static Ey9<HatchCardNetwork> getEntries() {
        return $ENTRIES;
    }

    public static HatchCardNetwork valueOf(String str) {
        return (HatchCardNetwork) Enum.valueOf(HatchCardNetwork.class, str);
    }

    public static HatchCardNetwork[] values() {
        return (HatchCardNetwork[]) $VALUES.clone();
    }

    public final boolean acceptsPanLength(int i) {
        return C60Q.A1W(this.panLengths, i);
    }

    public final List<Integer> getGroupSizes() {
        return this.groupSizes;
    }

    public final int getMaxPanLength() {
        return AnonymousClass001.A0F(AbstractC0878AGe.A08(this.panLengths));
    }

    public final int getSecurityCodeLength() {
        return this.securityCodeLength;
    }

    public HatchCardNetwork(String str, int i, C06827l3 c06827l3, Set set, int i2, List list) {
        this.prefix = c06827l3;
        this.panLengths = set;
        this.securityCodeLength = i2;
        this.groupSizes = list;
    }
}
