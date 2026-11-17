package X;

import com.facebook.aura.conversation.search.SearchResultsListStateKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7948FMe {
    public static final EnumC7948FMe[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7948FMe[] A02;
    public static final EnumC7948FMe A03;
    public static final EnumC7948FMe A04;
    public static final EnumC7948FMe A05;
    public final boolean fullScreenStyle;
    public final String value;
    public final boolean wrapsContent;

    static {
        EnumC7948FMe enumC7948FMe = new EnumC7948FMe(0, false, "FULL_SHEET", false, "full_sheet");
        A04 = enumC7948FMe;
        EnumC7948FMe enumC7948FMe2 = new EnumC7948FMe(1, false, "HALF_SHEET", false, "half_sheet");
        A05 = enumC7948FMe2;
        EnumC7948FMe enumC7948FMe3 = new EnumC7948FMe(2, false, "AUTO_SHEET", false, "auto_sheet");
        EnumC7948FMe enumC7948FMe4 = new EnumC7948FMe(3, false, "EXPANDABLE_AUTO_SHEET", false, "expandable_auto_sheet");
        EnumC7948FMe enumC7948FMe5 = new EnumC7948FMe(4, false, "FULL_SCREEN", true, SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN);
        A03 = enumC7948FMe5;
        EnumC7948FMe[] enumC7948FMeArr = {enumC7948FMe, enumC7948FMe2, enumC7948FMe3, enumC7948FMe4, enumC7948FMe5, new EnumC7948FMe(5, false, "FULL_SCREEN_STYLE_SHEET", true, "full_screen_style_sheet"), new EnumC7948FMe(6, true, "FLEXIBLE_SHEET", false, "flexible_sheet"), new EnumC7948FMe(7, false, "HALF_SHEET_WITH_UNDERLAY", false, "half_sheet_with_underlay"), new EnumC7948FMe(8, true, "WRAP_CONTENT_SHEET", false, "wrap_content_sheet")};
        A02 = enumC7948FMeArr;
        F3w f3wA0w = C3cG.A0w(enumC7948FMeArr);
        A01 = f3wA0w;
        A00 = (EnumC7948FMe[]) f3wA0w.toArray(new EnumC7948FMe[0]);
    }

    public static final EnumC7948FMe A00(String str) {
        for (EnumC7948FMe enumC7948FMe : A00) {
            if (str.equals(enumC7948FMe.toString())) {
                return enumC7948FMe;
            }
        }
        EnumC7951FMh enumC7951FMh = FMd.A0Q;
        Hx0.A00();
        return A04;
    }

    public static EnumC7948FMe valueOf(String str) {
        return (EnumC7948FMe) Enum.valueOf(EnumC7948FMe.class, str);
    }

    public static EnumC7948FMe[] values() {
        return (EnumC7948FMe[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public EnumC7948FMe(int i, boolean z, String str, boolean z2, String str2) {
        this.value = str2;
        this.wrapsContent = z;
        this.fullScreenStyle = z2;
    }
}
