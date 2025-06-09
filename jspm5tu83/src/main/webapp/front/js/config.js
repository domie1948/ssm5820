
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '发型美容师',
	url: './pages/faxingmeirongshi/list.jsp'
}, 
{
	name: '套餐信息',
	url: './pages/taocanxinxi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm5tu83/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","充值"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工打卡","menuJump":"列表","tableName":"yuangongdaka"}],"menu":"员工打卡管理"},{"child":[{"buttons":["查看","删除","报表"],"menu":"技师预约","menuJump":"列表","tableName":"jishiyuyue"}],"menu":"技师预约管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"发型美容师","menuJump":"列表","tableName":"faxingmeirongshi"}],"menu":"发型美容师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"技师类型","menuJump":"列表","tableName":"jishileixing"}],"menu":"技师类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"套餐信息","menuJump":"列表","tableName":"taocanxinxi"}],"menu":"套餐信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"套餐类型","menuJump":"列表","tableName":"taocanleixing"}],"menu":"套餐类型管理"},{"child":[{"buttons":["查看","删除","报表"],"menu":"套餐购买","menuJump":"列表","tableName":"taocangoumai"}],"menu":"套餐购买管理"},{"child":[{"buttons":["查看","删除"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","预约"],"menu":"发型美容师列表","menuJump":"列表","tableName":"faxingmeirongshi"}],"menu":"发型美容师模块"},{"child":[{"buttons":["查看","查看评论","购买"],"menu":"套餐信息列表","menuJump":"列表","tableName":"taocanxinxi"}],"menu":"套餐信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["支付","查看"],"menu":"技师预约","menuJump":"列表","tableName":"jishiyuyue"}],"menu":"技师预约管理"},{"child":[{"buttons":["查看","支付"],"menu":"套餐购买","menuJump":"列表","tableName":"taocangoumai"}],"menu":"套餐购买管理"},{"child":[{"buttons":["查看"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","预约"],"menu":"发型美容师列表","menuJump":"列表","tableName":"faxingmeirongshi"}],"menu":"发型美容师模块"},{"child":[{"buttons":["查看","查看评论","购买"],"menu":"套餐信息列表","menuJump":"列表","tableName":"taocanxinxi"}],"menu":"套餐信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"会员","tableName":"huiyuan"},{"backMenu":[{"child":[{"buttons":["查看","新增"],"menu":"员工打卡","menuJump":"列表","tableName":"yuangongdaka"}],"menu":"员工打卡管理"},{"child":[{"buttons":["报表","查看"],"menu":"技师预约","menuJump":"列表","tableName":"jishiyuyue"}],"menu":"技师预约管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","预约"],"menu":"发型美容师列表","menuJump":"列表","tableName":"faxingmeirongshi"}],"menu":"发型美容师模块"},{"child":[{"buttons":["查看","查看评论","购买"],"menu":"套餐信息列表","menuJump":"列表","tableName":"taocanxinxi"}],"menu":"套餐信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
