package com.facebook.aura.library.view;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.utils.HatchStringUtils;

/* loaded from: classes2.dex */
public final class GoalArtifactFormatting {
    public static final int $stable = 0;
    public static final GoalArtifactFormatting INSTANCE = new GoalArtifactFormatting();

    private final String cleanedGoalText(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() == 0) {
            return null;
        }
        return strA0l;
    }

    public final String displaySubtitle(GoalAssociation goalAssociation) {
        String subtitle;
        C7384Etj.A0Y(goalAssociation, 0);
        if (goalAssociation instanceof GoalAssociation.Space) {
            subtitle = ((GoalAssociation.Space) goalAssociation).getSubtitle();
        } else if (goalAssociation instanceof GoalAssociation.Document) {
            subtitle = ((GoalAssociation.Document) goalAssociation).getSubtitle();
        } else {
            if (!(goalAssociation instanceof GoalAssociation.Cron)) {
                throw C3cG.A0q();
            }
            GoalAssociation.Cron cron = (GoalAssociation.Cron) goalAssociation;
            String strCleanedGoalText = cleanedGoalText(cron.schedule);
            if (strCleanedGoalText != null) {
                return strCleanedGoalText;
            }
            subtitle = cron.getSubtitle();
        }
        return cleanedGoalText(subtitle);
    }

    public final String displayTitle(GoalAssociation goalAssociation) {
        C7384Etj.A0Y(goalAssociation, 0);
        if (goalAssociation instanceof GoalAssociation.Space) {
            String title = ((GoalAssociation.Space) goalAssociation).getTitle();
            return title == null ? "" : title;
        }
        if (goalAssociation instanceof GoalAssociation.Document) {
            String title2 = ((GoalAssociation.Document) goalAssociation).getTitle();
            return humanize(title2 != null ? title2 : "");
        }
        if (!(goalAssociation instanceof GoalAssociation.Cron)) {
            throw C3cG.A0q();
        }
        GoalAssociation.Cron cron = (GoalAssociation.Cron) goalAssociation;
        String title3 = cron.getTitle();
        return humanize(cronNamePart(title3 != null ? title3 : "", cron.cronId));
    }

    public final String humanize(String str) {
        C7384Etj.A0Y(str, 0);
        String strStripExtension = stripExtension(AnonymousClass002.A0l(str));
        return (strStripExtension.length() == 0 || C7BY.A0q(strStripExtension, InviteCodeScratcherKt.CODE_SEPARATOR, false)) ? strStripExtension : HatchStringUtils.INSTANCE.humanizeSlug(strStripExtension);
    }

    private final String cronNamePart(String str, String str2) {
        int iA0B = C7BY.A0B(str, "__", 0, false);
        if (iA0B >= 0) {
            String strSubstring = str.substring(0, iA0B);
            if (strSubstring.length() != 0) {
                return strSubstring;
            }
        } else if (str.length() != 0) {
            return str;
        }
        return str2;
    }

    private final String stripExtension(String str) {
        String strSubstring;
        int length;
        C7384Etj.A0Y(str, 0);
        int iA09 = C7BY.A09(str, '.', str.length() - 1);
        if (iA09 <= 0 || 1 > (length = (strSubstring = str.substring(iA09 + 1)).length()) || length >= 6) {
            return str;
        }
        int i = 0;
        while (Character.isLetterOrDigit(strSubstring.charAt(i))) {
            i++;
            if (i >= length) {
                return str.substring(0, iA09);
            }
        }
        return str;
    }
}
