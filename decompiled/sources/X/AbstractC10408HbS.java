package X;

import com.facebook.aura.commands.notifications.WorkAppNotificationFilterKt;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.HbS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10408HbS extends AbstractC10407HbR {
    public static final List<Set<String>> A00;
    public static final List<Set<String>> A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final Set<String> A05;
    public static final Set<String> A06;
    public static final Set<String> A07;

    static {
        Set<String> set = AbstractC10407HbR.A01;
        String[] strArr = new String[30];
        boolean zA1U = BV5.A1U(new String[]{"com.facebook.mk", "com.oculus.horizon.dev", "com.oculus.panelapp.settings", "com.oculus.shellenv", "com.facebook.games", "com.facebook.home.dev", "com.facebook.bonfire", "com.facebook.workdev", "com.facebook.home", "com.facebook.phone", "com.facebook.stella_debug", "com.facebook.mlite", "com.facebook.akira", "com.facebook.appmanager.dev", "com.facebook.daykira", "com.facebook.wearable.monza", "com.instagram.direct", "com.facebook.wakizashi", "com.facebook.horizon", "com.facebook.react.panelapp", "com.facebook.together.together.stable", "com.facebook.together.together.release_nightly", "com.facebook.together.together.stable", "com.facebook.together.together.staging", "com.meta.mr.awe", "com.meta.ar.arshellux", "com.oculus.vrshell.home"}, strArr);
        System.arraycopy(new String[]{"com.oculus.externaldisplayservice", "com.facebook.orca.debug", "com.instagram.android.debug"}, zA1U ? 1 : 0, strArr, 27, 3);
        A01 = Arrays.asList(set, BFI.A0H(strArr));
        A00 = Arrays.asList(AbstractC10407HbR.A00, BFI.A0H(new String[]{"com.facebook.globalsecurity", "com.facebook.mlite_debug", "com.oculus.rooms", "com.facebook.horizon", "com.facebook.together.together.stable", "com.facebook.together.together.release_nightly", "com.facebook.together.together.stable", "com.facebook.together.together.staging", "com.facebook.orca.debug", "com.instagram.android.debug"}));
        String[] strArr2 = new String[57];
        System.arraycopy(new String[]{"com.facebook.adsmanager", "com.facebook.akira", "com.facebook.appmanager", "com.facebook.appmanager.dev", "com.facebook.arstudio.player", "com.facebook.assistantplayground", "com.facebook.aura", "com.facebook.bishop", "com.facebook.pages.app", "com.facebook.creatorstudio", "com.facebook.daykira", "com.instagram.direct", "com.facebook.lite", "com.facebook.games", "com.facebook.phone", "com.facebook.home", "com.facebook.home.dev", "com.instagram.android", "com.instagram.lite", "com.facebook.katana", "com.facebook.orca", "com.facebook.react.panelapp", "com.facebook.talk", "com.facebook.mk", "com.facebook.mlite", "com.facebook.wearable.monza", "com.oculus.assistant"}, zA1U ? 1 : 0, strArr2, zA1U ? 1 : 0, 27);
        System.arraycopy(new String[]{"com.oculus.vrshell", "com.oculus.firsttimenux", "com.oculus.horizon", "com.oculus.horizon.dev", "com.oculus.metacam", "com.oculus.panelapp.settings", "com.oculus.vrshell.home", "com.oculus.ocms", "com.oculus.systemutilities", "com.oculus.twilight", "com.oculus.userserver2", "com.oculus.updater", "com.oculus.systemux", "com.oculus.xrstreamingclient", "com.facebook.bonfire", "com.facebook.stella", "com.facebook.stella_debug", "com.facebook.study", "com.instagram.barcelona", "com.instagram.basel", "com.facebook.wakizashi", "com.whatsapp", "com.whatsapp.w4b", "com.facebook.horizon", "com.facebook.together.together.stable", "com.facebook.together.together.release_nightly", "com.facebook.together.together.stable"}, zA1U ? 1 : 0, strArr2, 27, 27);
        System.arraycopy(new String[]{"com.facebook.together.together.staging", "com.facebook.orca.debug", "com.instagram.android.debug"}, zA1U ? 1 : 0, strArr2, 54, 3);
        A03 = BFI.A0H(strArr2);
        String[] strArr3 = new String[67];
        System.arraycopy(new String[]{"com.facebook.adsmanager", "com.facebook.akira", "com.facebook.appmanager", "com.facebook.appmanager.dev", "com.facebook.arstudio.player", "com.facebook.assistantplayground", "com.facebook.aura", "com.instagram.barcelona", "com.instagram.basel", "com.facebook.bishop", "com.facebook.pages.app", "com.facebook.creatorstudio", "com.facebook.daykira", "com.instagram.direct", "com.facebook.lite", "com.facebook.games", "com.facebook.phone", "com.facebook.home", "com.facebook.home.dev", "com.instagram.android", "com.instagram.lite", "com.facebook.katana", "com.facebook.orca", "com.facebook.react.panelapp", "com.facebook.talk", "com.facebook.mk", "com.facebook.mlite"}, zA1U ? 1 : 0, strArr3, zA1U ? 1 : 0, 27);
        System.arraycopy(new String[]{"com.facebook.wearable.system.data", "com.facebook.wearable.apps.mwear", "com.facebook.wearable.system.notification", "com.facebook.wearable.monza", "com.oculus.assistant", "com.oculus.captionservice", "com.oculus.vrshell", "com.oculus.firsttimenux", "com.oculus.horizon", "com.oculus.horizon.dev", "com.oculus.metacam", "com.oculus.panelapp.settings", "com.oculus.vrshell.home", "com.oculus.ocms", "com.oculus.q4bservice", "com.oculus.systemutilities", "com.oculus.twilight", "com.oculus.userserver2", "com.oculus.updater", "com.oculus.systemux", "com.oculus.xrstreamingclient", "com.oculus.companion.server", "com.facebook.bonfire", "com.facebook.stella", "com.facebook.stella_debug", "com.facebook.study", "com.instagram.barcelona"}, zA1U ? 1 : 0, strArr3, 27, 27);
        System.arraycopy(new String[]{"com.instagram.basel", "com.facebook.wakizashi", "com.facebook.wearable.system.launcher", "com.whatsapp", "com.whatsapp.w4b", "com.facebook.horizon", "com.facebook.together.together.stable", "com.facebook.together.together.release_nightly", "com.facebook.together.together.stable", "com.facebook.together.together.staging", "com.facebook.react.panelapp", "com.facebook.orca.debug", "com.instagram.android.debug"}, zA1U ? 1 : 0, strArr3, 54, 13);
        A02 = BFI.A0H(strArr3);
        A07 = C60O.A1A(WorkAppNotificationFilterKt.WORKPLACE_PKG, "com.facebook.workdev", "com.facebook.workchat");
        A04 = BFI.A0H(new String[]{"com.instagram.direct", "com.instagram.android", "com.instagram.lite", "com.instagram.barcelona", "com.instagram.basel"});
        A06 = C60O.A19("com.whatsapp", "com.whatsapp.w4b");
        A05 = BFI.A0H(new String[]{"com.oculus.assistant", "com.oculus.browser", "com.oculus.captionservice", "com.oculus.companion.server", "com.oculus.explore", "com.oculus.firsttimenux", "com.oculus.vrshell.home", "com.oculus.horizon", "com.oculus.horizon.dev", "com.oculus.metacam", "com.oculus.nux.ota", "com.oculus.ocms", "com.oculus.panelapp.settings", "com.oculus.updater", "com.oculus.q4bservice", "com.oculus.store", "com.oculus.systemux", "com.oculus.xrstreamingclient", "com.oculus.systemutilities", "com.oculus.twilight", "com.oculus.userserver2", "com.oculus.externaldisplayservice"});
    }
}
