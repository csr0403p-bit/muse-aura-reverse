package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06827l3;
import X.C06847l8;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pU;
import X.C3up;
import X.C4JM;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.C9tI;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.app.Application;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.ListFormatter;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.model.HatchTaskCadence;
import com.facebook.aura.model.HatchTaskCadenceKind;
import com.facebook.aura.model.HatchTaskEntry;
import com.facebook.aura.model.HatchTaskRunEntry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.repo.LoadingState;
import com.facebook.aura.status.repo.TaskRemovalResult;
import com.facebook.aura.status.repo.TasksData;
import com.facebook.aura.status.repo.TasksDataSource;
import com.facebook.aura.toast.api.ToastApi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class TasksViewModel extends AEs {
    public static final Map<String, Integer> DAY_ABBREVIATION_TO_STRING_RES;
    public static final long SECONDS_PER_HOUR = 3600;
    public static final long SECONDS_PER_MINUTE = 60;
    public static final List<String> WEEKDAY_ABBREVIATIONS;
    public static final SimpleDateFormat isoFormatter;
    public final BLG<UiState> _uiState;
    public final Map<String, AHD<HatchTaskRunUiModel>> cachedRuns;
    public final TasksDataSource dataSource;
    public boolean hasSkippedFirstOnResume;
    public final C1BN<UiState> uiState;
    public static final Companion Companion = new Companion();
    public static final SimpleDateFormat timeFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault());

    public final class Companion {
        private final String extractTime(String str, ConvertedScheduleTime convertedScheduleTime) throws ParseException {
            Integer numA0r;
            if (str == null || str.length() == 0) {
                return null;
            }
            Date runonceDate = parseRunonceDate(str);
            if (runonceDate != null) {
                return TasksViewModel.timeFormatter.format(runonceDate);
            }
            if (convertedScheduleTime != null) {
                return convertedScheduleTime.text;
            }
            int iA08 = C7BY.A08(str, '@', 0);
            if (iA08 < 0) {
                return null;
            }
            String strSubstring = str.substring(iA08 + 1);
            int iA09 = C7BY.A09(strSubstring, '-', strSubstring.length() - 1);
            if (iA09 >= 0) {
                strSubstring = strSubstring.substring(iA09 + 1);
            }
            List listA0i = C7BY.A0i(strSubstring, new String[]{":"}, 0);
            if (listA0i.size() < 2 || (numA0r = C9tI.A0r((String) listA0i.get(0))) == null) {
                return null;
            }
            int iIntValue = numA0r.intValue();
            Integer numA0r2 = C9tI.A0r((String) listA0i.get(1));
            if (numA0r2 == null) {
                return null;
            }
            int iIntValue2 = numA0r2.intValue();
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.set(11, iIntValue);
            calendar.set(12, iIntValue2);
            calendar.set(13, 0);
            return TasksViewModel.timeFormatter.format(calendar.getTime());
        }

        private final LocalTime parseRecurringTime(String str) {
            int iA08 = C7BY.A08(str, '@', 0);
            if (iA08 < 0) {
                return null;
            }
            String strSubstring = str.substring(iA08 + 1);
            return parseTimeOfDay(C7BY.A0R(strSubstring, strSubstring, '-'));
        }

        private final LocalTime parseTimeOfDay(String str) {
            Integer numA0r;
            Object objA0s;
            List listA0i = C7BY.A0i(str, new String[]{":"}, 0);
            if (listA0i.size() < 2 || (numA0r = C9tI.A0r((String) listA0i.get(0))) == null) {
                return null;
            }
            int iIntValue = numA0r.intValue();
            Integer numA0r2 = C9tI.A0r((String) listA0i.get(1));
            if (numA0r2 == null) {
                return null;
            }
            try {
                objA0s = LocalTime.of(iIntValue, numA0r2.intValue());
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            return (LocalTime) (objA0s instanceof C10571Hud ? null : objA0s);
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchTaskCadenceKind.values().length];
                try {
                    AnonymousClass002.A13(HatchTaskCadenceKind.DAILY, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchTaskCadenceKind.WEEKLY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchTaskCadenceKind.MONTHLY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(HatchTaskCadenceKind.YEARLY, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(HatchTaskCadenceKind.RUNONCE, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    AnonymousClass002.A18(HatchTaskCadenceKind.INTERVAL, iArr);
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private final String formatCadenceSubtitle(HatchTaskCadence hatchTaskCadence, Long l, int i) {
            switch (hatchTaskCadence.kind.ordinal()) {
                case 0:
                    if (l != null) {
                        return formatNextRunDate(l.longValue());
                    }
                    return null;
                case 1:
                    Long l2 = hatchTaskCadence.intervalSeconds;
                    if (l2 != null) {
                        return formatIntervalSeconds(l2.longValue());
                    }
                    return null;
                case 2:
                case 4:
                case 5:
                    return null;
                case 3:
                    return formatWeekdays(hatchTaskCadence.weekdays, i);
                default:
                    throw C3cG.A0q();
            }
        }

        private final String formatIntervalLabel(String str) throws Resources.NotFoundException {
            Integer numA0r;
            int i;
            C06847l8 c06847l8A06 = new C06827l3("^(\\d+)([mhs])$").A06(str);
            if (c06847l8A06 == null || (numA0r = C9tI.A0r(c06847l8A06.AG1().get(1))) == null) {
                return str;
            }
            int iIntValue = numA0r.intValue();
            Resources resources = C4JM.A00().getResources();
            String str2 = c06847l8A06.AG1().get(2);
            int iHashCode = str2.hashCode();
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115 || !str2.equals("s")) {
                        return str;
                    }
                    i = R.plurals._name_removed__res_0x7f10003e;
                } else {
                    if (!str2.equals("m")) {
                        return str;
                    }
                    i = R.plurals._name_removed__res_0x7f10003d;
                }
            } else {
                if (!str2.equals("h")) {
                    return str;
                }
                i = R.plurals._name_removed__res_0x7f10003c;
            }
            String quantityString = resources.getQuantityString(i, iIntValue, numA0r);
            C7384Etj.A0U(quantityString);
            return quantityString;
        }

        private final String formatNextRunDate(long j) {
            String str = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(j * 1000));
            C7384Etj.A0U(str);
            return str;
        }

        private final String formatNextRunTime(long j) {
            String str = new SimpleDateFormat("h:mm a", Locale.getDefault()).format(new Date(j * 1000));
            C7384Etj.A0U(str);
            return str;
        }

        private final String formatSubtitle(HatchTaskEntry hatchTaskEntry, Long l, int i) throws ParseException {
            String cadenceSubtitle;
            String strSubstring;
            int iA08;
            HatchTaskCadence hatchTaskCadence = hatchTaskEntry.cadence;
            if (hatchTaskCadence == null || (cadenceSubtitle = TasksViewModel.Companion.formatCadenceSubtitle(hatchTaskCadence, l, i)) == null) {
                String str = hatchTaskEntry.scheduleKey;
                cadenceSubtitle = null;
                if (str != null && str.length() != 0) {
                    if (str.startsWith("runonce@")) {
                        Long l2 = hatchTaskEntry.nextRunAtUtc;
                        if (l2 != null) {
                            return TasksViewModel.Companion.formatNextRunDate(l2.longValue());
                        }
                        Date runonceDate = parseRunonceDate(str);
                        if (runonceDate != null) {
                            return TasksViewModel.dateFormatter.format(runonceDate);
                        }
                    }
                    if (str.startsWith("interval@")) {
                        return formatIntervalLabel(str.substring(9));
                    }
                    if (str.startsWith("hourly@")) {
                        return C4JM.A00().getString(R.string._name_removed__res_0x7f12106c);
                    }
                    if (str.startsWith("weekly@") && (iA08 = C7BY.A08((strSubstring = str.substring(7)), '-', 0)) >= 0) {
                        List listA0g = C7BY.A0g(strSubstring.substring(0, iA08), new char[]{','});
                        if (!(listA0g instanceof Collection) || !listA0g.isEmpty()) {
                            Iterator it = listA0g.iterator();
                            while (it.hasNext()) {
                                if (C7BY.A0j(AnonymousClass005.A0j(it))) {
                                    return null;
                                }
                            }
                        }
                        return AbstractC0878AGe.A0L(", ", "", "", listA0g, new TasksViewModel$Companion$formatSubtitle$6(i));
                    }
                }
            }
            return cadenceSubtitle;
        }

        private final String formatTaskName(String str) {
            String strA0L = C7BY.A0L("__", C7BY.A0K("__", str));
            C7384Etj.A0Y(strA0L, 0);
            String strReplace = strA0L.replace('-', ' ').replace('_', ' ');
            if (strReplace.length() <= 0) {
                return strReplace;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) C3up.A00(strReplace.charAt(0)));
            return AnonymousClass001.A0v(strReplace.substring(1), sb);
        }

        private final Date parseRunonceDate(String str) throws ParseException {
            Date date = null;
            if (!AnonymousClass005.A1a(str, "runonce@")) {
                return null;
            }
            try {
                date = TasksViewModel.isoFormatter.parse(str.substring(8));
                return date;
            } catch (Exception unused) {
                return date;
            }
        }

        private final LocalTime recurringWallClock(HatchTaskEntry hatchTaskEntry) {
            LocalTime timeOfDay;
            HatchTaskCadence hatchTaskCadence = hatchTaskEntry.cadence;
            if (hatchTaskCadence != null) {
                switch (hatchTaskCadence.kind.ordinal()) {
                    case 0:
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        String str = hatchTaskCadence.time;
                        if (str != null && (timeOfDay = TasksViewModel.Companion.parseTimeOfDay(str)) != null) {
                            return timeOfDay;
                        }
                        break;
                    default:
                        throw C3cG.A0q();
                }
            }
            String str2 = hatchTaskEntry.scheduleKey;
            if (str2 == null || !(str2.startsWith("daily@") || str2.startsWith("weekly@") || str2.startsWith("monthly@") || str2.startsWith("yearly@"))) {
                return null;
            }
            return parseRecurringTime(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String shiftWeekday(String str, int i) {
            List<String> list = TasksViewModel.WEEKDAY_ABBREVIATIONS;
            Iterator<String> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it), str, true)) {
                    return (i2 < 0 || i == 0) ? str : list.get((((i2 + i) % list.size()) + list.size()) % list.size());
                }
                i2++;
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.facebook.aura.status.viewmodel.ConvertedScheduleTime convertRecurringTime(com.facebook.aura.model.HatchTaskEntry r6) {
            /*
                r5 = this;
                java.time.LocalTime r5 = r5.recurringWallClock(r6)
                r4 = 0
                if (r5 != 0) goto L8
                return r4
            L8:
                java.lang.String r1 = r6.timezone
                if (r1 == 0) goto L21
                com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                java.time.ZoneId r1 = java.time.ZoneId.of(r1)     // Catch: java.lang.Throwable -> L13
                goto L18
            L13:
                r0 = move-exception
                X.Hud r1 = X.C3cG.A0s(r0)
            L18:
                boolean r0 = r1 instanceof X.C10571Hud
                if (r0 != 0) goto L1d
                r4 = r1
            L1d:
                java.time.ZoneId r4 = (java.time.ZoneId) r4
                if (r4 != 0) goto L23
            L21:
                java.time.ZoneOffset r4 = java.time.ZoneOffset.UTC
            L23:
                java.time.ZoneId r2 = java.time.ZoneId.systemDefault()
                java.lang.Long r0 = r6.nextRunAtUtc
                if (r0 == 0) goto L35
                long r0 = r0.longValue()
                java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0)
                if (r0 != 0) goto L39
            L35:
                java.time.Instant r0 = java.time.Instant.now()
            L39:
                java.time.ZonedDateTime r0 = r0.atZone(r4)
                java.time.LocalDate r3 = r0.toLocalDate()
                java.time.LocalDateTime r0 = r3.atTime(r5)
                java.time.ZonedDateTime r0 = r0.atZone(r4)
                java.time.Instant r0 = r0.toInstant()
                java.time.ZonedDateTime r2 = r0.atZone(r2)
                java.text.SimpleDateFormat r1 = com.facebook.aura.status.viewmodel.TasksViewModel.timeFormatter
                java.util.Date r0 = java.util.Date.from(r0)
                java.lang.String r4 = r1.format(r0)
                X.C7384Etj.A0U(r4)
                java.time.temporal.ChronoUnit r1 = java.time.temporal.ChronoUnit.DAYS
                java.time.LocalDate r0 = r2.toLocalDate()
                long r2 = r1.between(r3, r0)
                int r1 = (int) r2
                com.facebook.aura.status.viewmodel.ConvertedScheduleTime r0 = new com.facebook.aura.status.viewmodel.ConvertedScheduleTime
                r0.<init>(r4, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.TasksViewModel.Companion.convertRecurringTime(com.facebook.aura.model.HatchTaskEntry):com.facebook.aura.status.viewmodel.ConvertedScheduleTime");
        }

        private final String formatIntervalSeconds(long j) {
            int i;
            int i2;
            Resources resources = C4JM.A00().getResources();
            if (j <= 0) {
                return null;
            }
            if (j == TasksViewModel.SECONDS_PER_HOUR) {
                return resources.getString(R.string._name_removed__res_0x7f12106c);
            }
            if (j % TasksViewModel.SECONDS_PER_HOUR == 0) {
                i = (int) (j / TasksViewModel.SECONDS_PER_HOUR);
                i2 = R.plurals._name_removed__res_0x7f10003c;
            } else {
                if (j % 60 != 0) {
                    int i3 = (int) j;
                    return resources.getQuantityString(R.plurals._name_removed__res_0x7f10003e, i3, Integer.valueOf(i3));
                }
                i = (int) (j / 60);
                i2 = R.plurals._name_removed__res_0x7f10003d;
            }
            return resources.getQuantityString(i2, i, Integer.valueOf(i));
        }

        private final String formatWeekdays(List<String> list, int i) {
            String strValueOf;
            Application applicationA00 = C4JM.A00();
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                Locale locale = Locale.ROOT;
                C7384Etj.A0V(locale);
                String lowerCase = strA0j.toLowerCase(locale);
                if (lowerCase.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = lowerCase.charAt(0);
                    String upperCase = String.valueOf(cCharAt).toUpperCase(locale);
                    if (upperCase.length() > 1) {
                        strValueOf = upperCase;
                        if (cCharAt != '\u0149') {
                            char cCharAt2 = upperCase.charAt(0);
                            String lowerCase2 = upperCase.substring(1).toLowerCase(locale);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cCharAt2);
                            strValueOf = AnonymousClass001.A0v(lowerCase2, sb2);
                        }
                    } else {
                        boolean zEquals = upperCase.equals(upperCase);
                        strValueOf = upperCase;
                        if (zEquals) {
                            strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        }
                    }
                    sb.append((Object) strValueOf);
                    lowerCase = AnonymousClass001.A0v(lowerCase.substring(1), sb);
                }
                Integer num = TasksViewModel.DAY_ABBREVIATION_TO_STRING_RES.get(TasksViewModel.Companion.shiftWeekday(lowerCase, i));
                if (num != null) {
                    arrayListA0h.add(applicationA00.getString(num.intValue()));
                }
            }
            if (arrayListA0h.isEmpty()) {
                return null;
            }
            return ListFormatter.getInstance(Locale.getDefault()).format(arrayListA0h);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final X.HxE<java.lang.String, com.facebook.aura.status.viewmodel.HatchTaskRunTone> mapRunStatus(java.lang.String r2) throws android.content.res.Resources.NotFoundException {
            /*
                r1 = this;
                android.app.Application r0 = X.C4JM.A00()
                android.content.res.Resources r1 = r0.getResources()
                int r0 = r2.hashCode()
                switch(r0) {
                    case -1313911455: goto L16;
                    case -1281977283: goto L22;
                    case -1212540263: goto L34;
                    case -948696717: goto L46;
                    case 476588369: goto L52;
                    case 647890911: goto L5e;
                    case 945734241: goto L70;
                    default: goto Lf;
                }
            Lf:
                com.facebook.aura.status.viewmodel.HatchTaskRunTone r0 = com.facebook.aura.status.viewmodel.HatchTaskRunTone.NEUTRAL
            L11:
                X.HxE r0 = X.C3cG.A0r(r2, r0)
                return r0
            L16:
                java.lang.String r0 = "timeout"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890280(0x7f121068, float:1.9415247E38)
                goto L3f
            L22:
                java.lang.String r0 = "failed"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890277(0x7f121065, float:1.9415241E38)
                java.lang.String r2 = r1.getString(r0)
                com.facebook.aura.status.viewmodel.HatchTaskRunTone r0 = com.facebook.aura.status.viewmodel.HatchTaskRunTone.ERROR
                goto L11
            L34:
                java.lang.String r0 = "dispatched"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890276(0x7f121064, float:1.941524E38)
            L3f:
                java.lang.String r2 = r1.getString(r0)
                com.facebook.aura.status.viewmodel.HatchTaskRunTone r0 = com.facebook.aura.status.viewmodel.HatchTaskRunTone.WARNING
                goto L11
            L46:
                java.lang.String r0 = "queued"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890278(0x7f121066, float:1.9415243E38)
                goto L69
            L52:
                java.lang.String r0 = "cancelled"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890274(0x7f121062, float:1.9415235E38)
                goto L69
            L5e:
                java.lang.String r0 = "deferred"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890275(0x7f121063, float:1.9415237E38)
            L69:
                java.lang.String r2 = r1.getString(r0)
                com.facebook.aura.status.viewmodel.HatchTaskRunTone r0 = com.facebook.aura.status.viewmodel.HatchTaskRunTone.NEUTRAL
                goto L11
            L70:
                java.lang.String r0 = "succeeded"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto Lf
                r0 = 2131890279(0x7f121067, float:1.9415245E38)
                java.lang.String r2 = r1.getString(r0)
                com.facebook.aura.status.viewmodel.HatchTaskRunTone r0 = com.facebook.aura.status.viewmodel.HatchTaskRunTone.SUCCESS
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.TasksViewModel.Companion.mapRunStatus(java.lang.String):X.HxE");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AHD<HatchTaskUiModel> mapTaskEntries(List<HatchTaskEntry> list) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchTaskEntry hatchTaskEntry : list) {
                TaskCategory taskCategoryClassify = TaskCategory.Companion.classify(hatchTaskEntry);
                Long l = null;
                if (taskCategoryClassify != null) {
                    Companion companion = TasksViewModel.Companion;
                    ConvertedScheduleTime convertedScheduleTimeConvertRecurringTime = companion.convertRecurringTime(hatchTaskEntry);
                    Long l2 = hatchTaskEntry.nextRunAtUtc;
                    if (l2 == null) {
                        HatchTaskCadence hatchTaskCadence = hatchTaskEntry.cadence;
                        if (hatchTaskCadence != null) {
                            l = hatchTaskCadence.runAtUtc;
                        }
                    } else {
                        l = l2;
                    }
                    String str = hatchTaskEntry.id;
                    String taskName = hatchTaskEntry.title;
                    if (taskName == null) {
                        taskName = companion.formatTaskName(str);
                    }
                    arrayListA0h.add(new HatchTaskUiModel(str, taskName, hatchTaskEntry.path, taskCategoryClassify, hatchTaskEntry.mode, hatchTaskEntry.enabled, companion.formatSubtitle(hatchTaskEntry, l, convertedScheduleTimeConvertRecurringTime != null ? convertedScheduleTimeConvertRecurringTime.dayOffset : 0), l != null ? companion.formatNextRunTime(l.longValue()) : companion.extractTime(hatchTaskEntry.scheduleKey, convertedScheduleTimeConvertRecurringTime), hatchTaskEntry.executionTarget));
                }
            }
            return AGI.A07(arrayListA0h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AHD<HatchTaskRunUiModel> mapTaskRuns(List<HatchTaskRunEntry> list) throws Resources.NotFoundException {
            Locale locale = Locale.getDefault();
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
            DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton(android.text.format.DateFormat.is24HourFormat(C4JM.A00()) ? "Hm" : "hm", locale);
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (HatchTaskRunEntry hatchTaskRunEntry : list) {
                HxE<String, HatchTaskRunTone> hxEMapRunStatus = TasksViewModel.Companion.mapRunStatus(hatchTaskRunEntry.status);
                String str = hxEMapRunStatus.first;
                HatchTaskRunTone hatchTaskRunTone = hxEMapRunStatus.second;
                Date date = new Date(hatchTaskRunEntry.scheduledForUtc * 1000);
                String str2 = hatchTaskRunEntry.runId;
                String str3 = hatchTaskRunEntry.triggerReason;
                String str4 = hatchTaskRunEntry.resultSummary;
                int i = hatchTaskRunEntry.attempt;
                String str5 = instanceForSkeleton.format(date);
                C7384Etj.A0U(str5);
                String str6 = instanceForSkeleton2.format(date);
                C7384Etj.A0U(str6);
                arrayListA0i.add(new HatchTaskRunUiModel(str2, str, hatchTaskRunTone, str3, str4, i, str5, str6));
            }
            return AGI.A07(arrayListA0i);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Factory extends AuraViewModelFactory<TasksViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public TasksViewModel create() {
            Companion companion = TasksViewModel.Companion;
            return new TasksViewModel(TasksDataSource.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final boolean isLoadingRuns;
        public final LoadingState loadingState;
        public final String selectedTaskId;
        public final AHD<HatchTaskRunUiModel> selectedTaskRuns;
        public final AHD<HatchTaskUiModel> tasks;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.tasks, uiState.tasks) || !C7384Etj.areEqual(this.selectedTaskId, uiState.selectedTaskId) || !C7384Etj.areEqual(this.selectedTaskRuns, uiState.selectedTaskRuns) || this.isLoadingRuns != uiState.isLoadingRuns) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, AHD ahd, String str, AHD ahd2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                loadingState = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                ahd = uiState.tasks;
            }
            if ((i & 4) != 0) {
                str = uiState.selectedTaskId;
            }
            if ((i & 8) != 0) {
                ahd2 = uiState.selectedTaskRuns;
            }
            if ((i & 16) != 0) {
                z = uiState.isLoadingRuns;
            }
            return uiState.copy(loadingState, ahd, str, ahd2, z);
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final AHD<HatchTaskUiModel> component2() {
            return this.tasks;
        }

        public final String component3() {
            return this.selectedTaskId;
        }

        public final AHD<HatchTaskRunUiModel> component4() {
            return this.selectedTaskRuns;
        }

        public final boolean component5() {
            return this.isLoadingRuns;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final String getSelectedTaskId() {
            return this.selectedTaskId;
        }

        public final AHD<HatchTaskRunUiModel> getSelectedTaskRuns() {
            return this.selectedTaskRuns;
        }

        public final AHD<HatchTaskUiModel> getTasks() {
            return this.tasks;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.selectedTaskRuns, (AnonymousClass005.A0F(this.tasks, AnonymousClass005.A0E(this.loadingState)) + AnonymousClass006.A0G(this.selectedTaskId)) * 31), this.isLoadingRuns);
        }

        public final boolean isLoadingRuns() {
            return this.isLoadingRuns;
        }

        public UiState(LoadingState loadingState, AHD<HatchTaskUiModel> ahd, String str, AHD<HatchTaskRunUiModel> ahd2, boolean z) {
            AnonymousClass005.A0y(loadingState, ahd, ahd2);
            this.loadingState = loadingState;
            this.tasks = ahd;
            this.selectedTaskId = str;
            this.selectedTaskRuns = ahd2;
            this.isLoadingRuns = z;
        }

        public final UiState copy(LoadingState loadingState, AHD<HatchTaskUiModel> ahd, String str, AHD<HatchTaskRunUiModel> ahd2, boolean z) {
            AnonymousClass005.A0y(loadingState, ahd, ahd2);
            return new UiState(loadingState, ahd, str, ahd2, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, AHD ahd, String str, AHD ahd2, boolean z, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? AHI.A01 : ahd2, C3cI.A1S(i, z));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public UiState() {
            LoadingState loadingState = LoadingState.INITIAL;
            AHI ahi = AHI.A01;
            this(loadingState, ahi, null, ahi, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$loadRuns$2", f = "TasksViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$loadRuns$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksViewModel.this.new AnonymousClass2(this.$id, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[PHI: r8
  0x001c: PHI (r8v2 X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel>) = 
  (r8v0 X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel>)
  (r8v3 X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel>)
 binds: [B:11:0x001a, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r3 = 1
                if (r0 == 0) goto L52
                if (r0 != r3) goto L68
                X.Hwg.A00(r10)
            Lc:
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L18
                com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                X.AHD r8 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion.access$mapTaskRuns(r0, r10)
                if (r8 != 0) goto L1c
            L18:
                X.AHI r8 = X.AHI.A01
                if (r10 == 0) goto L27
            L1c:
                com.facebook.aura.status.viewmodel.TasksViewModel r1 = com.facebook.aura.status.viewmodel.TasksViewModel.this
                com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                java.util.Map<java.lang.String, X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel>> r1 = r1.cachedRuns
                java.lang.String r0 = r9.$id
                r1.put(r0, r8)
            L27:
                com.facebook.aura.status.viewmodel.TasksViewModel r1 = com.facebook.aura.status.viewmodel.TasksViewModel.this
                com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                X.BLG<com.facebook.aura.status.viewmodel.TasksViewModel$UiState> r3 = r1._uiState
                java.lang.String r2 = r9.$id
            L2f:
                java.lang.Object r1 = r3.getValue()
                r4 = r1
                com.facebook.aura.status.viewmodel.TasksViewModel$UiState r4 = (com.facebook.aura.status.viewmodel.TasksViewModel.UiState) r4
                java.lang.String r0 = r4.selectedTaskId
                boolean r0 = X.C7384Etj.areEqual(r0, r2)
                if (r0 == 0) goto L49
                com.facebook.aura.status.repo.LoadingState r5 = r4.loadingState
                X.AHD<com.facebook.aura.status.viewmodel.HatchTaskUiModel> r6 = r4.tasks
                java.lang.String r7 = r4.selectedTaskId
                r9 = 0
                com.facebook.aura.status.viewmodel.TasksViewModel$UiState r4 = r4.copy(r5, r6, r7, r8, r9)
            L49:
                boolean r0 = r3.A6e(r1, r4)
                if (r0 == 0) goto L2f
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L52:
                X.Hwg.A00(r10)
                com.facebook.aura.status.viewmodel.TasksViewModel r1 = com.facebook.aura.status.viewmodel.TasksViewModel.this
                com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                com.facebook.aura.status.repo.TasksDataSource r2 = r1.dataSource
                java.lang.String r1 = r9.$id
                r9.label = r3
                r0 = 50
                java.lang.Object r10 = r2.loadRuns(r1, r0, r9)
                if (r10 != r4) goto Lc
                return r4
            L68:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.TasksViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$loadTasks$1", f = "TasksViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$loadTasks$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TasksViewModel tasksViewModel = TasksViewModel.this;
                Companion companion = TasksViewModel.Companion;
                TasksDataSource tasksDataSource = tasksViewModel.dataSource;
                this.label = 1;
                if (tasksDataSource.loadTasks(false, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TasksViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$observeDataSource$1", f = "TasksViewModel.kt", l = {541}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$observeDataSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C141081 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$observeDataSource$1$1", f = "TasksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$observeDataSource$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04011 extends AbstractC07127nr implements G0V<TasksData, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ TasksViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04011(TasksViewModel tasksViewModel, HtJ<? super C04011> htJ) {
                super(2, htJ);
                this.this$0 = tasksViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C04011 c04011 = new C04011(this.this$0, htJ);
                c04011.L$0 = obj;
                return c04011;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r2 = r10.L$0
                    com.facebook.aura.status.repo.TasksData r2 = (com.facebook.aura.status.repo.TasksData) r2
                    int r0 = r10.label
                    if (r0 != 0) goto L6e
                    X.Hwg.A00(r11)
                    com.facebook.aura.status.viewmodel.TasksViewModel r1 = r10.this$0
                    com.facebook.aura.status.viewmodel.TasksViewModel$Companion r0 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                    X.BLG<com.facebook.aura.status.viewmodel.TasksViewModel$UiState> r3 = r1._uiState
                L11:
                    java.lang.Object r4 = r3.getValue()
                    r6 = r4
                    com.facebook.aura.status.viewmodel.TasksViewModel$UiState r6 = (com.facebook.aura.status.viewmodel.TasksViewModel.UiState) r6
                    java.lang.String r5 = r6.selectedTaskId
                    r11 = 0
                    if (r5 == 0) goto L29
                    java.util.List<com.facebook.aura.model.HatchTaskEntry> r1 = r2.tasks
                    boolean r0 = r1 instanceof java.util.Collection
                    if (r0 == 0) goto L54
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L54
                L29:
                    r5 = 0
                L2a:
                    com.facebook.aura.status.viewmodel.TasksViewModel$Companion r1 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion
                    java.util.List<com.facebook.aura.model.HatchTaskEntry> r0 = r2.tasks
                    X.AHD r8 = com.facebook.aura.status.viewmodel.TasksViewModel.Companion.access$mapTaskEntries(r1, r0)
                    if (r5 == 0) goto L50
                    java.lang.String r9 = r6.selectedTaskId
                    X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel> r10 = r6.selectedTaskRuns
                    boolean r11 = r6.isLoadingRuns
                L3a:
                    boolean r0 = r2.isLoading
                    if (r0 == 0) goto L4d
                    com.facebook.aura.status.repo.LoadingState r7 = com.facebook.aura.status.repo.LoadingState.LOADING
                L40:
                    com.facebook.aura.status.viewmodel.TasksViewModel$UiState r0 = r6.copy(r7, r8, r9, r10, r11)
                    boolean r0 = r3.A6e(r4, r0)
                    if (r0 == 0) goto L11
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L4d:
                    com.facebook.aura.status.repo.LoadingState r7 = com.facebook.aura.status.repo.LoadingState.SUCCESS
                    goto L40
                L50:
                    r9 = 0
                    X.AHI r10 = X.AHI.A01
                    goto L3a
                L54:
                    java.util.Iterator r1 = r1.iterator()
                L58:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L29
                    java.lang.Object r0 = r1.next()
                    com.facebook.aura.model.HatchTaskEntry r0 = (com.facebook.aura.model.HatchTaskEntry) r0
                    java.lang.String r0 = r0.id
                    boolean r0 = r5.equals(r0)
                    if (r0 == 0) goto L58
                    r5 = 1
                    goto L2a
                L6e:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.TasksViewModel.C141081.C04011.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(TasksData tasksData, HtJ<? super Unit> htJ) {
                return ((C04011) create(tasksData, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C141081(HtJ<? super C141081> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksViewModel.this.new C141081(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TasksViewModel tasksViewModel = TasksViewModel.this;
                Companion companion = TasksViewModel.Companion;
                C1BN<TasksData> c1bn = tasksViewModel.dataSource.data;
                C04011 c04011 = new C04011(tasksViewModel, null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c04011, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TasksViewModel.this.new C141081(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$onResume$1", f = "TasksViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$onResume$1, reason: invalid class name and case insensitive filesystem */
    public final class C141091 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141091(HtJ<? super C141091> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksViewModel.this.new C141091(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TasksViewModel tasksViewModel = TasksViewModel.this;
                Companion companion = TasksViewModel.Companion;
                TasksDataSource tasksDataSource = tasksViewModel.dataSource;
                this.label = 1;
                if (tasksDataSource.loadTasks(true, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TasksViewModel.this.new C141091(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.TasksViewModel$removeTask$1", f = "TasksViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.TasksViewModel$removeTask$1, reason: invalid class name and case insensitive filesystem */
    public final class C141101 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141101(String str, HtJ<? super C141101> htJ) {
            super(2, htJ);
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TasksViewModel.this.new C141101(this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ToastApi toastApi;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                toastApi = ToastApi.INSTANCE;
                TasksViewModel tasksViewModel = TasksViewModel.this;
                Companion companion = TasksViewModel.Companion;
                TasksDataSource tasksDataSource = tasksViewModel.dataSource;
                String str = this.$id;
                this.L$0 = toastApi;
                this.label = 1;
                obj = tasksDataSource.removeTask(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                toastApi = (ToastApi) this.L$0;
                Hwg.A00(obj);
            }
            toastApi.showToast(((TaskRemovalResult) obj).getToastRes());
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C141101) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TasksViewModel(TasksDataSource tasksDataSource) {
        C7384Etj.A0Y(tasksDataSource, 0);
        this.dataSource = tasksDataSource;
        LoadingState loadingState = LoadingState.INITIAL;
        AHI ahi = AHI.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(loadingState, ahi, null, ahi, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.cachedRuns = C3cG.A0j();
        observeDataSource();
        loadTasks();
    }

    public final void loadRuns(String str) throws Resources.NotFoundException {
        UiState value;
        UiState uiState;
        AHD<HatchTaskRunUiModel> ahd;
        boolean z;
        C7384Etj.A0Y(str, 0);
        Companion companion = Companion;
        List<HatchTaskRunEntry> list = this.dataSource.data.getValue().runs;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchTaskRunEntry hatchTaskRunEntry : list) {
            C3cI.A1J(hatchTaskRunEntry.jobId, hatchTaskRunEntry, str, arrayListA0h);
        }
        AHD<HatchTaskRunUiModel> ahdMapTaskRuns = companion.mapTaskRuns(arrayListA0h);
        if (ahdMapTaskRuns.isEmpty()) {
            ahdMapTaskRuns = this.cachedRuns.get(str);
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
            if (ahdMapTaskRuns == null) {
                ahd = AHI.A01;
                z = true;
            } else {
                ahd = ahdMapTaskRuns;
                z = false;
            }
        } while (!blg.A6e(value, uiState.copy(uiState.loadingState, uiState.tasks, str, ahd, z)));
        if (ahdMapTaskRuns == null) {
            AnonymousClass001.A1J(new AnonymousClass2(str, null), AEu.A00(this));
        }
    }

    public final void removeTask(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C141101(str, null), AEu.A00(this));
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        isoFormatter = simpleDateFormat;
        DAY_ABBREVIATION_TO_STRING_RES = AGH.A0D(C3cG.A0r("Mon", Integer.valueOf(R.string._name_removed__res_0x7f121020)), C3cG.A0r("Tue", Integer.valueOf(R.string._name_removed__res_0x7f121024)), C3cG.A0r("Wed", Integer.valueOf(R.string._name_removed__res_0x7f121025)), C3cG.A0r("Thu", Integer.valueOf(R.string._name_removed__res_0x7f121023)), C3cG.A0r("Fri", Integer.valueOf(R.string._name_removed__res_0x7f12101f)), C3cG.A0r("Sat", Integer.valueOf(R.string._name_removed__res_0x7f121021)), C3cG.A0r("Sun", Integer.valueOf(R.string._name_removed__res_0x7f121022)));
        WEEKDAY_ABBREVIATIONS = Arrays.asList("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    }

    public final void clearSelectedTaskRuns() {
        UiState value;
        UiState uiState;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.loadingState, uiState.tasks, null, AHI.A01, false)));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onResume() {
        if (!this.hasSkippedFirstOnResume) {
            this.hasSkippedFirstOnResume = true;
        } else {
            AnonymousClass001.A1J(new C141091(null), AEu.A00(this));
        }
    }

    private final void observeDataSource() {
        AnonymousClass001.A1J(new C141081(null), AEu.A00(this));
    }

    public final void loadTasks() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }
}
