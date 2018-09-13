package org.taskforce.episample.db.filter.checkbox

import org.taskforce.episample.db.config.customfield.CustomField
import org.taskforce.episample.db.config.customfield.value.BooleanValue
import org.taskforce.episample.db.filter.Rule
import org.taskforce.episample.db.filter.RuleMaker


class BooleanRuleFactory {
    enum class Rules(val displayName: String, val comparator: (Boolean, Boolean) -> Boolean) {
        IS_EQUAL_TO("=", { lhs: Boolean, rhs: Boolean -> lhs == rhs }),
        IS_NOT_EQUAL_TO("≠", { lhs: Boolean, rhs: Boolean -> lhs != rhs });
    }

    companion object: RuleMaker<Rules, Boolean> {
        override fun makeRule(ruleType: Rules, forField: CustomField, value: Boolean): Rule {
            return BooleanComparisonRule(ruleType, forField, BooleanValue(value))
        }
    }
}