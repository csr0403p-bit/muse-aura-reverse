package com.facebook.traffic.nts.providers.background;

import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C60R;
import X.C7384Etj;
import X.C77S;
import X.C77i;
import X.C77j;
import X.Ey9;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class JobResult {
    public final String errorMessage;
    public final ResultCategory resultCategory;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ResultCategory {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ResultCategory[] $VALUES;
        public static final ResultCategory CONFIGURATION_ERROR;
        public static final ResultCategory SUCCESS;
        public static final ResultCategory TIMEOUT;
        public static final ResultCategory UNHANDLED_EXCEPTION;
        public static final ResultCategory UNKNOWN_ERROR;

        static {
            ResultCategory resultCategory = new ResultCategory("SUCCESS", 0);
            SUCCESS = resultCategory;
            ResultCategory resultCategory2 = new ResultCategory("CONFIGURATION_ERROR", 1);
            CONFIGURATION_ERROR = resultCategory2;
            ResultCategory resultCategory3 = new ResultCategory("TIMEOUT", 2);
            TIMEOUT = resultCategory3;
            ResultCategory resultCategory4 = new ResultCategory("UNKNOWN_ERROR", 3);
            UNKNOWN_ERROR = resultCategory4;
            ResultCategory resultCategory5 = new ResultCategory("UNHANDLED_EXCEPTION", 4);
            UNHANDLED_EXCEPTION = resultCategory5;
            ResultCategory[] resultCategoryArr = {resultCategory, resultCategory2, resultCategory3, resultCategory4, resultCategory5};
            $VALUES = resultCategoryArr;
            $ENTRIES = C3cG.A0w(resultCategoryArr);
        }

        public static Ey9<ResultCategory> getEntries() {
            return $ENTRIES;
        }

        public static ResultCategory valueOf(String str) {
            return (ResultCategory) Enum.valueOf(ResultCategory.class, str);
        }

        public static ResultCategory[] values() {
            return (ResultCategory[]) $VALUES.clone();
        }

        public ResultCategory(String str, int i) {
        }
    }

    public JobResult(ResultCategory resultCategory, String str) {
        C7384Etj.A0Y(resultCategory, 0);
        this.resultCategory = resultCategory;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        String str = this.errorMessage;
        return str == null ? "" : str;
    }

    public final String getResultCategoryAsString() {
        return this.resultCategory.toString();
    }

    public final C77S getWorkerResult() {
        ResultCategory resultCategory = this.resultCategory;
        if (resultCategory == ResultCategory.SUCCESS) {
            return new C77i();
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.put("failureCategory", resultCategory.toString());
        return new C77j(C60R.A0J("errorMessage", this.errorMessage, linkedHashMapA0j));
    }

    public /* synthetic */ JobResult(ResultCategory resultCategory, String str, int i, C06H c06h) {
        this(resultCategory, AnonymousClass006.A0s(i, str));
    }
}
