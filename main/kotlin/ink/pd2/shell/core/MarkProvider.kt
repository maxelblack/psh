package ink.pd2.shell.core

interface MarkProvider {

    /**
     * ## getSign() | 获取记号
     *
     * 如题, 用于获取这个标记类型的记号
     *
     * @return 记号字符
     *
     * @author Maxel Black (maxelblack@outlook.com)
     */

    fun getSign(): String

    /**
     * ## onMarkUpdate() | 在更新标记时的事件
     *
     * 在执行字符串标记更新时, 这个事件会被调用以获取用于替换的字符
     *
     * @param value 被标记的字符串
     *
     * @return 用于替换的字符串
     *
     * @author Maxel Black (maxelblack@outlook.com)
     */

    fun onMarkUpdate(value: String): String
}
