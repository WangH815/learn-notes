Java注解

JDK自带注解
@Override         //表示当前方法覆盖了父类的方法
@Deprecation      //表示方法已经过时,方法上有横线，使用时会有警告
@SuppviseWarnings //表示关闭一些警告信息(通知java编译器忽略特定的编译警告)


文档类型
//       单行注释
    
/*       多行注释
code
*/

/**      文档注释，也称javadoc注释
*
*/


javadoc 标签
javadoc 工具软件识别以下标签：
标签	        描述	                                                示例
@author	        标识一个类的作者	                                    @author description
@deprecated	    指名一个过期的类或成员	                                @deprecated description
{@docRoot}	    指明当前文档根目录的路径	                            Directory Path
@exception	    标志一个类抛出的异常	                                @exception exception-name explanation
{@inheritDoc}	从直接父类继承的注释	                                Inherits a comment from the immediate surperclass.
{@link}	        插入一个到另一个主题的链接	                            {@link name text}
{@linkplain}	插入一个到另一个主题的链接，但是该链接显示纯文本字体	Inserts an in-line link to another topic.
@param	        说明一个方法的参数	                                    @param parameter-name explanation
@return	        说明返回值类型	                                        @return explanation
@see	        指定一个到另一个主题的链接	                            @see anchor
@serial	        说明一个序列化属性	                                    @serial description
@serialData	    说明通过writeObject( ) 和 writeExternal( )方法写的数据	@serialData description
@serialField	说明一个ObjectStreamField组件	                        @serialField name type description
@since	        标记当引入一个特定的变化时	                            @since release
@throws	        和 @exception 标签一样.	The                             @throws tag has the same meaning as the @exception tag.
{@value}	    显示常量的值，该常量必须是static属性。	                Displays the value of a constant, which must be a static field.
@version	    指定类的版本	                                        @version info

示例
/** 这个类绘制一个条形图
* @author runoob
* @version 1.2
*/

Eclipse加载插件JAutodoc
参考注释
类：
/*
 * <p>项目名称: ${project_name} </p> 
 * <p>文件名称: ${file_name} </p> 
 * <p>描述: [类型描述] </p>
 * <p>创建时间: ${date} </p>
 * <p>公司信息: ************公司 *********部</p> 
 * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
 * @version v1.0
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
 
方法：
/**
 * @Title：${enclosing_method}
 * @Description: [功能描述]
 * @Param: ${tags}
 * @Return: ${return_type}
 * @author <a href="mail to: *******@******.com" rel="nofollow">作者</a>
 * @CreateDate: ${date} ${time}</p> 
 * @update: [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]     
 */
getter 和 setter

/**
 * 获取  ${bare_field_name}
 */



/**
 * 设置   ${bare_field_name} 
 * (${param})${field}
 */
