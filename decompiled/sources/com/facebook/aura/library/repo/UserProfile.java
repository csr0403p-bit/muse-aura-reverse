package com.facebook.aura.library.repo;

import X.A6B;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06827l3;
import X.C06847l8;
import X.C06G;
import X.C06H;
import X.C10543Hqv;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C8iN;
import X.EnumC06837l4;
import com.facebook.aura.model.IdentitySection;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class UserProfile extends C06G {
    public final String birthday;
    public final String interests;
    public final String location;
    public final String name;
    public final String preferences;
    public final AHD<IdentitySection> sections;
    public static final Companion Companion = new Companion();
    public static final C06827l3 BOLD_FIELD_REGEX = new C06827l3("^-\\s*\\*\\*(.+?):\\*\\*\\s*(.+)", EnumC06837l4.A03);
    public static final C06827l3 SECTION_HEADER_REGEX = new C06827l3("^##\\s+(.+)");
    public static final Set<String> KNOWN_FIELD_NAMES = BFI.A0H(new String[]{"name", "birthday", MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, "interests", "preferences"});

    public final class Companion {
        public static final void parse$flushSection(C10543Hqv<String> c10543Hqv, StringBuilder sb, List<IdentitySection> list) {
            String str = c10543Hqv.element;
            String strA0l = AnonymousClass002.A0l(sb.toString());
            if (str != null && strA0l.length() > 0) {
                list.add(new IdentitySection(str, strA0l));
            }
            c10543Hqv.element = null;
            sb.setLength(0);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
        public final UserProfile parse(String str) {
            ArrayList arrayListA0y = C3cI.A0y(str);
            C10543Hqv c10543HqvA0z = C3cG.A0z();
            StringBuilder sb = new StringBuilder();
            Iterator it = A6B.A02(new C8iN(str, 1)).iterator();
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (it.hasNext()) {
                String strA0l = AnonymousClass002.A0l(AnonymousClass005.A0j(it));
                C06847l8 c06847l8A06 = UserProfile.SECTION_HEADER_REGEX.A06(strA0l);
                if (c06847l8A06 != null) {
                    parse$flushSection(c10543HqvA0z, sb, arrayListA0y);
                    ?? A0l = AnonymousClass002.A0l(C3cI.A0e(c06847l8A06, 1));
                    if (!UserProfile.KNOWN_FIELD_NAMES.contains(AnonymousClass001.A0u(A0l))) {
                        c10543HqvA0z.element = A0l;
                    }
                } else {
                    C06847l8 c06847l8A062 = UserProfile.BOLD_FIELD_REGEX.A06(strA0l);
                    if (c06847l8A062 != null) {
                        String strA0J = C3cJ.A0J(C3cI.A0e(c06847l8A062, 1));
                        String strA0l2 = AnonymousClass002.A0l(c06847l8A062.AG1().get(2));
                        switch (strA0J.hashCode()) {
                            case 3373707:
                                if (!strA0J.equals("name")) {
                                    break;
                                } else {
                                    str2 = strA0l2;
                                    break;
                                }
                            case 502611593:
                                if (!strA0J.equals("interests")) {
                                    break;
                                } else {
                                    str5 = strA0l2;
                                    break;
                                }
                            case 1069376125:
                                if (!strA0J.equals("birthday")) {
                                    break;
                                } else {
                                    str3 = strA0l2;
                                    break;
                                }
                            case 1901043637:
                                if (!strA0J.equals(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL)) {
                                    break;
                                } else {
                                    str4 = strA0l2;
                                    break;
                                }
                            case 1989861112:
                                if (!strA0J.equals("preferences")) {
                                    break;
                                } else {
                                    str6 = strA0l2;
                                    break;
                                }
                        }
                    } else if (c10543HqvA0z.element != 0) {
                        sb.append(strA0l);
                        sb.append('\n');
                    }
                }
            }
            parse$flushSection(c10543HqvA0z, sb, arrayListA0y);
            if (str2 != null) {
                return new UserProfile(str2, str3, str4, str5, str6, AGI.A07(arrayListA0y));
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public UserProfile() {
        this(null, null, null, null, null, AHI.A01);
    }

    public final UserProfile copy(String str, String str2, String str3, String str4, String str5, AHD<IdentitySection> ahd) {
        C7384Etj.A0Y(ahd, 5);
        return new UserProfile(str, str2, str3, str4, str5, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserProfile) {
                UserProfile userProfile = (UserProfile) obj;
                if (!C7384Etj.areEqual(this.name, userProfile.name) || !C7384Etj.areEqual(this.birthday, userProfile.birthday) || !C7384Etj.areEqual(this.location, userProfile.location) || !C7384Etj.areEqual(this.interests, userProfile.interests) || !C7384Etj.areEqual(this.preferences, userProfile.preferences) || !C7384Etj.areEqual(this.sections, userProfile.sections)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, String str3, String str4, String str5, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfile.name;
        }
        if ((i & 2) != 0) {
            str2 = userProfile.birthday;
        }
        if ((i & 4) != 0) {
            str3 = userProfile.location;
        }
        if ((i & 8) != 0) {
            str4 = userProfile.interests;
        }
        if ((i & 16) != 0) {
            str5 = userProfile.preferences;
        }
        if ((i & 32) != 0) {
            ahd = userProfile.sections;
        }
        return userProfile.copy(str, str2, str3, str4, str5, ahd);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.birthday;
    }

    public final String component3() {
        return this.location;
    }

    public final String component4() {
        return this.interests;
    }

    public final String component5() {
        return this.preferences;
    }

    public final AHD<IdentitySection> component6() {
        return this.sections;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getInterests() {
        return this.interests;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreferences() {
        return this.preferences;
    }

    public final AHD<IdentitySection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sections, ((((((((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.birthday)) * 31) + AnonymousClass006.A0G(this.location)) * 31) + AnonymousClass006.A0G(this.interests)) * 31) + AnonymousClass005.A0H(this.preferences)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public UserProfile(String str, String str2, String str3, String str4, String str5, AHD<IdentitySection> ahd) {
        C7384Etj.A0Y(ahd, 5);
        this.name = str;
        this.birthday = str2;
        this.location = str3;
        this.interests = str4;
        this.preferences = str5;
        this.sections = ahd;
    }

    public /* synthetic */ UserProfile(String str, String str2, String str3, String str4, String str5, AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? AHI.A01 : ahd);
    }
}
