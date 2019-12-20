$(document).ready(function(){

	var myWin = $(window).width();
	var autAni = new TimelineLite(); 
	//s::20190826 수정
	if (myWin > 960) {
		autAni
			.append(TweenMax.to($('.autumn19_set.set_01'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn19_set.set_02'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn19_maple'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn1_mv_wrap .autumn19_emblem'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn1_mv_wrap .btn_autumn19_detail'), .8, {css:{opacity:1}}))
			var controller = $.superscrollorama({
			triggerAtCenter: true
		});
		
	}else { 
		autAni
			.append(TweenMax.to($('.autumn1_mv_wrap .autumn19_emblem'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn19_set.set_02'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn19_set.set_01'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn19_maple'), .5, {css:{opacity:1}}))
			.append(TweenMax.to($('.autumn1_mv_wrap .btn_autumn19_detail'), .5, {css:{opacity:1}}))
			var controller = $.superscrollorama({
			triggerAtCenter: true
		});
	}
	//e::20190826 수정
	
	//Bean
	var controller = $.superscrollorama({
		triggerAtCenter: true
	});
	//s::20190826 수정
	if (myWin > 961) {
		
		var controller = $.superscrollorama();
		
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), .3, {css:{left:'18%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 2.0, {css:{left:'-100%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), .3, {css:{right:'1%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 2.5, {css:{right:'-100%', opacity:0}, ease: Quad.easeOut}), 1, 0);

	} else if (myWin <= 960) {
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 1, {css:{top:'11%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 2.5, {css:{top:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 1, {css:{bottom:'13%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 2.5, {css:{bottom:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
	} else if (myWin <= 500) {
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 1, {css:{top:'9%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 2.5, {css:{top:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 1, {css:{bottom:'12%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 2.5, {css:{bottom:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
	} else if (myWin <= 320) {
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 1, {css:{top:'9%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .winter19_bean'), 2.5, {css:{top:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.to($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 1, {css:{bottom:'10%', opacity:0}, ease: Quad.easeOut}), 1, 0);
		controller.addTween(10, TweenMax.from($('#autumn19_beanWrap .bean_wrap_inner .winter_bean_wrap .bean_right'), 2.5, {css:{bottom:'-50%', opacity:0}, ease: Quad.easeOut}), 1, 0);
	}
	//e::20190826 수정
});