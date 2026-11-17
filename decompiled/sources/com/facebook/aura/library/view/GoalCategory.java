package com.facebook.aura.library.view;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class GoalCategory implements GoalCreationCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalCategory[] $VALUES;
    public static final GoalCategory CAREER;
    public static final GoalCategory HEALTH;
    public static final GoalCategory INTERESTS;
    public static final GoalCategory MONEY;
    public static final GoalCategory PRODUCTIVITY;
    public static final GoalCategory RELATIONSHIPS;
    public final int iconRes;
    public final int labelRes;
    public final int promptRes;
    public final int sheetTitleRes;

    public static Ey9<GoalCategory> getEntries() {
        return $ENTRIES;
    }

    public static GoalCategory valueOf(String str) {
        return (GoalCategory) Enum.valueOf(GoalCategory.class, str);
    }

    public static GoalCategory[] values() {
        return (GoalCategory[]) $VALUES.clone();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    @Override // com.facebook.aura.library.view.GoalCreationCategory
    public int getPromptRes() {
        return this.promptRes;
    }

    public final int getSheetTitleRes() {
        return this.sheetTitleRes;
    }

    static {
        GoalCategory goalCategory = new GoalCategory("HEALTH", 0, R.string._name_removed__res_0x7f120a96, R.drawable.heart_outline_24_wght600, R.string._name_removed__res_0x7f120a9f, R.string._name_removed__res_0x7f120a7a);
        HEALTH = goalCategory;
        GoalCategory goalCategory2 = new GoalCategory("RELATIONSHIPS", 1, R.string._name_removed__res_0x7f120a9b, R.drawable.users2_outline_24_wght600, R.string._name_removed__res_0x7f120aa3, R.string._name_removed__res_0x7f120a7f);
        RELATIONSHIPS = goalCategory2;
        GoalCategory goalCategory3 = new GoalCategory("MONEY", 2, R.string._name_removed__res_0x7f120a98, R.drawable.currencydollar_outline_24_wght600, R.string._name_removed__res_0x7f120aa1, R.string._name_removed__res_0x7f120a7c);
        MONEY = goalCategory3;
        GoalCategory goalCategory4 = new GoalCategory("CAREER", 3, R.string._name_removed__res_0x7f120a95, R.drawable.buildingapartment_outline_24_wght600, R.string._name_removed__res_0x7f120a9e, R.string._name_removed__res_0x7f120a79);
        CAREER = goalCategory4;
        GoalCategory goalCategory5 = new GoalCategory("INTERESTS", 4, R.string._name_removed__res_0x7f120a97, R.drawable.paintpalette_outline_24_wght600, R.string._name_removed__res_0x7f120aa0, R.string._name_removed__res_0x7f120a7b);
        INTERESTS = goalCategory5;
        GoalCategory goalCategory6 = new GoalCategory("PRODUCTIVITY", 5, R.string._name_removed__res_0x7f120a9a, R.drawable.laptop_outline_24_wght600, R.string._name_removed__res_0x7f120aa2, R.string._name_removed__res_0x7f120a7e);
        PRODUCTIVITY = goalCategory6;
        GoalCategory[] goalCategoryArr = {goalCategory, goalCategory2, goalCategory3, goalCategory4, goalCategory5, goalCategory6};
        $VALUES = goalCategoryArr;
        $ENTRIES = new F3w(goalCategoryArr);
    }

    public GoalCategory(String str, int i, int i2, int i3, int i4, int i5) {
        this.labelRes = i2;
        this.iconRes = i3;
        this.promptRes = i4;
        this.sheetTitleRes = i5;
    }

    @Override // com.facebook.aura.library.view.GoalCreationCategory
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
